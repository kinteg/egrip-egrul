<template>
        <el-collapse v-model="activeNames">
            <el-collapse-item title="Форма поиска ЕГРЮЛ" name="1">
                <el-form :model="ruleForm" ref="ruleForm"  >
                    <el-form-item prop="name">
                        <el-form-item label="Название организации:">
                            <el-input type="text" v-model="ruleForm.name" placeholder="Астра" autocomplete="off"/>
                        </el-form-item>
                        <el-form-item label="Введите ОРГН:">
                            <el-input type="text" v-model="ruleForm.ogrn" placeholder="123456789" autocomplete="off"/>
                        </el-form-item>
                        <el-form-item label="Введите ИНН:">
                            <el-input type="text" v-model="ruleForm.inn" placeholder="123456789" autocomplete="off"/>
                        </el-form-item>
                        <el-form-item label="Выберите дату регистрации:">
                            <el-col :span="4">
                                <el-date-picker type="date" placeholder="Выберите дату" v-model="ruleForm.regStart"
                                                style="width: 100%;" value-format="yyyy-MM-dd"/>
                            </el-col>
                            <el-col class="line" :span="2" style="width: 0.5%;"> - </el-col>
                            <el-col :span="4">
                                <el-date-picker type="date" placeholder="Выберите дату" v-model="ruleForm.regEnd"
                                                style="width: 100%;" value-format="yyyy-MM-dd"/>
                            </el-col>
                        </el-form-item>
                    </el-form-item>
                    <el-form-item>
                        <button type="button" class="el-button" @click="submitForm('ruleForm')">НАЙТИ</button>
                    </el-form-item>
                </el-form>
            </el-collapse-item>
        </el-collapse>
</template>

<script>

    export default {
        name: "EgrulForm",
        data() {
            return {
                ruleForm: {
                    name: '',
                },
                ulData: '',
                activeNames: ['1']
            };
        },
        methods: {
            submitForm(formName) {
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        let ul = {
                            name: this.ruleForm.name,
                            ogrn: this.ruleForm.ogrn,
                            inn: this.ruleForm.inn,
                            regStart: this.ruleForm.regStart,
                            regEnd: this.ruleForm.regEnd,
                        };
                        this.$emit('loadData', ul);
                        this.activeNames = ['-1']
                    } else {
                        return false;
                    }
                });
            }
        }
    }
</script>

<style scoped>

    .el-form {
        display: block;
        text-align: left;
        margin: auto;
        padding-bottom: 40px;
        border-radius: 3px;
    }

    .el-button {
        background-color: #1265a8;
        border: 0;
        border-radius: 3px;
        padding: 13px 32px;
        color: #fff;
        cursor: pointer;
        font-size: 120%;
        letter-spacing: 1px;
        line-height: 20px;
        outline: none;
        text-transform: uppercase;
        position: relative;
        overflow: hidden;
    }

    .req {
        color: #ff0006;
    }

    .el-col {
        margin: 0;
        padding: 0;
    }


</style>