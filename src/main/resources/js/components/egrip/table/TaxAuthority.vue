<template>
    <custom-table :title="title" :name="name" :tableData="tableData"/>
</template>

<script>
    import CustomTable from "../../general/Table.vue";

    export default {
        name: "TaxAuthority",
        components: {CustomTable},
        props: ['ipData'],

        data() {
            return {
                title: 'Сведения о постановке индивидуального предпринимателя на учёт в налоговом органе',
                name: 'TaxAuthority',
                tableData: [{
                    name: 'Налоговый орган',
                    item: this.ipData.mns.name,
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