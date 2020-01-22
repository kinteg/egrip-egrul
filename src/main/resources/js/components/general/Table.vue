<template>
    <el-collapse-item :title="title" :name="name">
            <el-table
                    :data="tableData"
                    style="width: 100%">
                <el-table-column
                        prop="name">
                </el-table-column>
                <el-table-column
                        prop="item">
                </el-table-column>
            </el-table>
    </el-collapse-item>
</template>

<script>
    export default {
        name: "CustomTable",

        props: ['title', 'name', 'tableData']
    }
</script>

<style scoped>
    .el-table--mini, .el-table--small, .el-table__expand-icon {
        font-size: 100%;
        margin: auto;
    }
</style>