<template>
  <van-nav-bar
      title="标题"
      left-arrow
      @click-left="onClickLeft"
  >
    <template #right>
      <van-icon name="search" size="18"/>
    </template>
  </van-nav-bar>

  <div id="content">
    <router-view/>
  </div>

  <!--  <van-tabbar v-model="active" @change="onChange" route>-->
  <van-tabbar @change="onChange" route>
    <van-tabbar-item icon="home-o" name="index" to="/">主页</van-tabbar-item>
    <!--    <van-tabbar-item icon="search">搜索</van-tabbar-item>-->
    <van-tabbar-item icon="friends-o" name="team" to="/team">队伍</van-tabbar-item>
    <van-tabbar-item icon="setting-o" name="user" to="/my">我的</van-tabbar-item>
  </van-tabbar>
</template>

<script setup>
import {ref} from "vue";
import {showToast} from "vant";
import Index from "../views/Index.vue";
import Team from "../views/Team.vue";

const onClickLeft = () => alert("sad");

// const active = ref("index");
const onChange = (index) => showToast(`标签 ${index}`);

</script>

<style>

</style>