<template>
    <div>
        <egrul-form @loadData="loadData"/>
        <div v-if="totalPages > 0">
            <pagination
                    :page-size="pageSize"
                    :current-page="currentPage"
                    :totalPages="totalPages"
                    :totalElements="totalElements"
                    @onCurrentChange="onCurrentChange"
                    @onSizeChange="onSizeChange"/>

            <egrul-card :ulData="ulData"/>

            <pagination
                    :page-size="pageSize"
                    :current-page="currentPage"
                    :totalPages="totalPages"
                    :totalElements="totalElements"
                    @onCurrentChange="onCurrentChange"
                    @onSizeChange="onSizeChange"/>
        </div>
        <a v-if="totalPages === -1">Простите, таких данных не обнаружено</a>
    </div>
</template>

<script>
    import {AXIOS} from "../../../AXIOS/http-common";
    import EgrulCard from "./EgrulCard.vue";
    import Pagination from "../../general/Pagination.vue";
    import EgrulForm from "./EgrulForm.vue";

    export default {

        name: "EgrulContent",
        components: {EgrulForm, Pagination, EgrulCard},

        data() {
            return {
                ulData: '',
                pageSize: 10,
                currentPage: 1,
                totalPages: 0,
                totalElements: 0,
                url: ''
            }
        },

        methods: {

            onCurrentChange(value) {

                this.currentPage = value;

                AXIOS.get(this.url + '&page=' + (value - 1) + '&size=' + this.pageSize)
                    .then(response => {
                        this.ulData = response.data.content;
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error);
                    })

            },

            onSizeChange(value) {

                this.pageSize = value;
                this.currentPage = 1;

                AXIOS.get(this.url + '&size=' + value)
                    .then(response => {
                        this.ulData = response.data.content;
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error);
                    })

            },

            loadData(ul) {

                this.createUrl(ul);

                AXIOS.get(this.url)
                    .then(response => {
                        this.totalPages = response.data.totalPages !== 0 ? response.data.totalPages : -1;
                        if (this.totalPages !== -1) {
                            this.ulData = response.data.content;
                            this.totalElements = response.data.totalElements;
                        }
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error);
                    });
            },

            createUrl(ul) {
                this.url =
                    'egrul/filter?' +
                    (ul.name !== undefined ? "name=" + ul.name : '') +
                    (ul.ogrn !== undefined ? "&ogrn=" + ul.ogrn : '') +
                    (ul.inn !== undefined ? "&inn=" + ul.inn : '') +
                    (ul.regStart !== undefined ? "&regStart=" + ul.regStart : '') +
                    (ul.regEnd !== undefined ? "&regEnd=" + ul.regEnd : '') +
                    (this.pageSize !== undefined ? "&size=" + this.pageSize : '');
            }

        },

    }
</script>

<style scoped>

</style>