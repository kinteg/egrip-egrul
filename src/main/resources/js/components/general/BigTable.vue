<template>
    <el-collapse-item :title="title" :name="name">
        <div v-for="data in tableData">
            <el-table
                    :data="data"
                    style="width: 100%">
                <el-table-column
                        prop="name">
                </el-table-column>
                <el-table-column
                        prop="item">
                </el-table-column>
            </el-table>
        </div>
    </el-collapse-item>
</template>

<script>
    export default {
        name: "BigTable",
        props: ['title', 'name', 'tableData']
    }
</script>

<style scoped>
    .el-table--mini, .el-table--small, .el-table__expand-icon {
        font-family: "Open Sans", sans-serif;
        font-size: 100%;
        margin: auto;
    }
</style>