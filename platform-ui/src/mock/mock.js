import Mock from 'mockjs'

Mock.mock('http://localhost:8001/user', {
  'name': '@name', // 随机生成姓
  // eslint-disable-next-line
  'name': '@email', // 随机生成邮箱
  'age|1-10': 5 // 年龄1-10之间
})

Mock.mock('http://localhost:8001/menu', {
  'id': '@increment', // id自增
  'name': 'menu', // 名称为menu
  'order|1-20': 5 // 排序1-20之间
})

Mock.mock('http://localhost:8001/login', {
  'token': '332fr3e3rfsdfd'
})
