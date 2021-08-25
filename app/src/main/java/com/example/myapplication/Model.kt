package com.example.myapplication

class HomeFeed(val videos: List<Video>)
class Video(val id: Int, val name: String, val link: String, val imageUrl: String, val channel: Chanel, val numberOfViews: Int)
class Chanel(val name:String, val profileimageUrl: String)


//"id": 1,
//"name": "Instagram Firebase - Learn How to Create Users, Follow, and Send Push Notifications",
//"link": "https://www.letsbuildthatapp.com/course/instagram-firebase",
//"imageUrl": "https://letsbuildthatapp-videos.s3-us-west-2.amazonaws.com/04782e30-d72a-4917-9d7a-c862226e0a93",
//"channel": {
//    "name": "Lets Build That App",
//    "profileimageUrl": "https://letsbuildthatapp-videos.s3-us-west-2.amazonaws.com/dda5bc77-327f-4944-8f51-ba4f3651ffdf",
//    "numberOfSubscribers": 100000
//},
//"numberOfViews": 20000