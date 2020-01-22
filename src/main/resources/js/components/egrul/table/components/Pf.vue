<template>
    <custom-table :title="title" :name="name" :tableData="tableData"/>
</template>

<script>
    import CustomTable from "../../../general/Table.vue";

    export default {
        name: "Pf",
        components: {CustomTable},
        props: ['ulData'],

        data() {
            return {
                title: 'Сведения о регистрации в отделениях пенсионного фонда (ПФ)',
                name: 'Pf',
                tableData: [{
                    name: 'Регистрационный номер в фонде',
                    item: this.ulData.regNom,
                }, {
                    name: 'Наименование территориального органа фонда, в котором зарегистрировано ЮЛ',
                    item: this.ulData.pf.name,
                }, {
                    name: 'Дата постановки на учёт',
                    item: this.ulData.dtStart,
                }, {
                    name: 'Дата снятия с учёта',
                    item: this.ulData.dtEnd,
                }]

            }
        },
    }
</script>

<style scoped>

</style>