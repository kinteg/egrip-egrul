<template>
    <el-header>
        <el-menu class="el-menu-demo" mode="horizontal">
            <router-link class="el-menu-item" to="/egrul">ЕГРЮЛ</router-link>
            <router-link class="el-menu-item" to="/egrip">ЕГРИП</router-link>
        </el-menu>
    </el-header>
</template>

<script>
    export default {
        name: "Header"
    }
</script>

<style scoped>
    .el-header {
        margin: auto;
        display: block;
        padding: 10px;
    }

    .el-menu-item {
        text-decoration: none;
    }
</style>