<template>
    <div>
        <egrip-form @loadData="loadData"/>
        <div v-if="totalPages > 0">
            <pagination
                    :page-size="pageSize"
                    :current-page="currentPage"
                    :totalPages="totalPages"
                    :totalElements="totalElements"
                    @onCurrentChange="onCurrentChange"
                    @onSizeChange="onSizeChange"/>

            <egrip-card :ipData="ipData"/>

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
    import EgripCard from "./EgripCard.vue";
    import Pagination from "../../general/Pagination.vue";
    import EgripForm from "./EgripForm.vue";

    export default {

        name: "EgripContent",
        components: {EgripForm, Pagination, EgripCard},

        data() {
            return {
                ipData: '',
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

                AXIOS.get(this.url + '&page=' + (value - 1))
                    .then(response => {
                        this.ipData = response.data.content;
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
                        this.ipData = response.data.content;
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error);
                    })
            },

            loadData(ip) {
                this.createUrl(ip);

                AXIOS.get(this.url)
                    .then(response => {
                        this.totalPages = response.data.totalPages !== 0 ? response.data.totalPages : -1;
                        if (this.totalPages !== -1) {
                            this.ipData = response.data.content;
                            this.totalElements = response.data.totalElements;
                        }
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error);
                    });
            },

            createUrl(ip) {
                this.url =
                    'egrip/filter?' +
                    (ip.surname !== undefined ? 'surname=' + ip.surname : '') +
                    (ip.name !== undefined ? "&name=" + ip.name : '') +
                    (ip.middleName !== undefined ? "&middleName=" + ip.middleName : '') +
                    (ip.sex !== undefined ? "&sex=" + ip.sex : '') +
                    (ip.ogrn !== undefined ? "&ogrn=" + ip.ogrn : '') +
                    (ip.inn !== undefined ? "&inn=" + ip.inn : '') +
                    (ip.regStart !== undefined ? "&regStart=" + ip.regStart : '') +
                    (ip.regEnd !== undefined ? "&regEnd=" + ip.regEnd : '') +
                    (this.pageSize !== undefined ? "&size=" + this.pageSize : '');
            }

        },

    }
</script>

<style scoped>

</style>