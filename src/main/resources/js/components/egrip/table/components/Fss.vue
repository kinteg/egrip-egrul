<template>
    <custom-table :title="title" :name="name" :tableData="tableData"/>
</template>

<script>
    import CustomTable from "../../../general/Table.vue";

    export default {
        name: "Fss",
        components: {CustomTable},
        props: ['ipData'],

        data() {
            return {
                title: 'Сведения о регистрации в отделениях фонда социального страхования (ФСС)',
                name: 'Fss',
                tableData: [{
                    name: 'Регистрационный номер в фонде',
                    item: this.ipData.regNom,
                }, {
                    name: 'Наименование территориального органа фонда, в котором зарегистрировано ЮЛ',
                    item: this.ipData.fss.name,
                }, {
                    name: 'Дата постановки на учёт',
                    item: this.ipData.dtstart,
                }, {
                    name: 'Дата снятия с учёта',
                    item: this.ipData.dtend,
                }]

            }
        },
    }
</script>

<style scoped>

</style>