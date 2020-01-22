<template>
    <el-collapse v-if="ulData != null">
        <general :ulData="ulData"/>
        <full-info v-if="ulData.fl.length !== 0" :ulData="ulData.fl"/>
        <license v-if="ulData.licenzs.length !== 0" :ulData="ulData.licenzs"/>
        <changes v-if="ulData.gosRegs.length !== 0" :ulData="ulData.gosRegs"/>
        <mns v-if="ulData.mns != null" :ulData="ulData.mns"/>
        <foms v-if="ulData.foms != null" :ulData="ulData.foms"/>
        <fss v-if="ulData.fss != null" :ulData="ulData.fss"/>
        <pf v-if="ulData.pf != null" :ulData="ulData.pf"/>
    </el-collapse>
</template>

<script>
    import {AXIOS} from "../../../AXIOS/http-common";
    import General from "./components/General.vue";
    import FullInfo from "./components/FullName.vue";
    import License from "./components/License.vue";
    import Changes from "./components/Changes.vue";
    import Mns from "./components/Mns.vue";
    import Foms from "./components/Foms.vue";
    import Fss from "./components/Fss.vue";
    import Pf from "./components/Pf.vue";


    export default {
        name: "EgrulTable",
        components: {Pf, Fss, Foms, Mns, Changes, License, FullInfo, General},
        data() {
            return {
                ulData: null
            }
        },

        methods: {

            loadData() {

                AXIOS.get('egrul/' + this.$route.params.id)
                    .then(response => {
                        this.ulData = response.data;
                        if (this.ulData === '') {
                            this.$router.push("/egrul");
                        }
                    })
                    .catch(error => {
                        console.log('ERROR: ' + error);
                    })
            }

        },

        mounted() {
            this.loadData();
        }
    }
</script>

<style scoped>

</style>