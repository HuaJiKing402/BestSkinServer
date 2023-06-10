<template>
  <div id="www">
    <h2>用户登录</h2>
    <form>
      <div>
        <label for="username">用户名:</label>
        <input type="text" id="username" v-model="username" />
      </div>
      <div>
        <label for="password">密码:</label>
        <input type="password" id="password" v-model="password" />
      </div>
      <button @click.prevent="login">登录</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "App",
  data() {
    return {
      username: "",
      password: ""
    };
  },
  methods: {
    login() {
      // 在这里添加登录逻辑
      console.log("用户名:", this.username);
      console.log("密码:", this.password);
    }
  }
};
</script>

<style>
#www {
  font-family: Arial, sans-serif;
  max-width: 400px;
  margin: 0 auto;
  padding: 20px;
  text-align: center;
}
form {
  display: flex;
  flex-direction: column;
  align-items: center;
}
form div {
  margin: 10px;
}
form label {
  display: inline-block;
  width: 80px;
}
form input {
  padding: 5px;
}
button {
  padding: 10px 20px;
  background-color: #4CAF50;
  color: white;
}
</style>