<template>
    <custom-table :title="title" :name="name" :tableData="tableData"/>
</template>

<script>
    import CustomTable from "../../../general/Table.vue";

    export default {
        name: "Foms",
        components: {CustomTable},
        props: ['ipData'],

        data() {
            return {
                title: 'Сведения о регистрации в отделениях фонда обязательного медицинского страхования (ФОМС)',
                name: 'Foms',
                tableData: [{
                    name: 'Регистрационный номер в фонде',
                    item: this.ipData.regNom,
                }, {
                    name: 'Наименование территориального органа фонда, в котором зарегистрировано ЮЛ',
                    item: this.ipData.foms.name,
                }, {
                    name: 'Дата постановки на учёт',
                    item: this.ipData.dtStart,
                }, {
                    name: 'Дата снятия с учёта',
                    item: this.ipData.dtEnd,
                }]

            }
        },
    }
</script>

<style scoped>

</style>