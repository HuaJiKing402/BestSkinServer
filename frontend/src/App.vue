<script setup>

</script>
<template>
    <div class="common-layout">
        <el-container>
            <el-header>
                <el-text class="title">Best Skin Server</el-text>
            </el-header>
            <el-container>
                <el-aside width="200px">Aside</el-aside>
                <el-main>
                    <RouterView/>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>
<style>
.el-header{
    background-color: #202121;
    display: flex;
    justify-content: space-between;
    padding-left: 0;
    align-items: center;
    color: #fff;
    font-size: 20px;
}
.title {
    color: aliceblue;
    font-size: 25px;
    font-style: oblique;
    align-items: center;
    margin-left: 30px;
}
</style>