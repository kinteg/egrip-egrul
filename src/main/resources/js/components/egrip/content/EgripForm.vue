<template>
    <el-collapse v-model="activeNames">
        <el-collapse-item title="Форма поиска ЕГРИП" name="1">
            <el-form :model="ruleForm" ref="ruleForm"  >
                <el-form-item prop="name">
                    <el-form-item label="Фамилия:">
                        <el-input type="text" v-model="ruleForm.surname" placeholder="Иванов" autocomplete="off"/>
                    </el-form-item>
                    <el-form-item label="Имя:">
                        <el-input type="text" v-model="ruleForm.name" placeholder="Иван" autocomplete="off"/>
                    </el-form-item>
                    <el-form-item label="Отчество:">
                        <el-input type="text" v-model="ruleForm.middleName" placeholder="Иванович" autocomplete="off"/>
                    </el-form-item>
                    <el-form-item label="Выберите Пол:">
                        <el-select v-model="ruleForm.sex" placeholder="Выберите пол">
                            <el-option label="Мужской" value="1"/>
                            <el-option label="Женский" value="2"/>
                        </el-select>
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
                    <button type="button" class="el-button" @click="submitForm()">НАЙТИ</button>
                </el-form-item>
            </el-form>
        </el-collapse-item>
    </el-collapse>
</template>

<script>

    export default {
        name: "EgripForm",
        data() {
            return {
                ruleForm: {
                    name: '',
                },
                ipData: '',
                activeNames: '1'
            };
        },
        methods: {
            submitForm() {
                let ip = {
                    surname: this.ruleForm.surname,
                    name: this.ruleForm.name,
                    middleName: this.ruleForm.middleName,
                    sex: this.ruleForm.sex,
                    ogrn: this.ruleForm.ogrn,
                    inn: this.ruleForm.inn,
                    regStart: this.ruleForm.regStart,
                    regEnd: this.ruleForm.regEnd,
                };
                this.$emit('loadData', ip);
                this.activeNames = ['-1']
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
        font-size: 16px;
        font-family: 'PdfIntextCondPro-Bold';
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