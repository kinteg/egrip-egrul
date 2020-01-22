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
    .el-collapse-item {
        font-family: "Open Sans", sans-serif;
        font-size: 100px;
        margin: auto;
        color: #ff0006;
    }
</style>