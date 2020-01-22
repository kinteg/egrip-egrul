<template>
    <custom-table :title="title" :name="name" :tableData="tableData"/>
</template>

<script>

    import CustomTable from "../../../general/Table.vue";
    export default {
        name: "Mns",
        components: {CustomTable},
        props: ['ulData'],
        
        data() {
            return {
                title: 'Сведения о постановке индивидуального предпринимателя на учёт в налоговом органе',
                name: 'Mns',
                tableData: [{
                    name: 'Налоговый орган',
                    item: this.ulData.mns.name,
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