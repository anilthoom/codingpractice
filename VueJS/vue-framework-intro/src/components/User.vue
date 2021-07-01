<template>
    <div id="user">
        <h3>The User</h3>
        <p>My username is {{username}}</p>
    </div>
</template>

<script>
export default {
    data(){
        return{
            username: 'Anil'
        }
    }
}
</script>

<style>
    p {
        font-style: italic;
    }
</style>