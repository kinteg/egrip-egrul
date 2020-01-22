<template>
    <big-table :title="title" :name="name" :tableData="fillTableData()"/>
</template>

<script>
    import BigTable from "../../../general/BigTable.vue";

    export default {
        name: "License",
        components: {BigTable},
        props: ['ulData'],

        data() {
            return {
                title: 'Лицензии',
                name: 'License',
            }
        },

        methods: {
             fillTableData() {
                let tableData = [];
                for (let i = 0; i < this.ulData.length; i++) {
                    tableData[i] = [{
                        name: '№ лицензии',
                        item: this.ulData[i].lic,
                    }, {
                        name: 'Дата начала действия:',
                        item: this.ulData[i].dtStart,
                    }, {
                        name: 'Дата окончания действия:',
                        item: this.ulData[i].dtEnd,
                    }, {
                        name: 'Вид деятельности:',
                        item: this.ulData[i].vidLic.vidLic.name,
                    }, {
                        name: 'Орган выдачи лицензии:',
                        item: this.ulData[i].licOrg.name,
                    }]
                }
                return tableData;
            },
        },

    }
</script>

<style scoped>

</style>