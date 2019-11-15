# HighSpeedVideoDemo
演示如何使用Camera2的HighSpeed高帧率录制视频

**❗详细说明文档参见<https://www.jianshu.com/p/0d2f200ab374>**

### Demo Apk 下载

点击[下载DemoApk](https://github.com/ZhengShang/HighSpeedVideoDemo/raw/master/demo.apk)体验

### 界面预览

![预览画面](https://upload-images.jianshu.io/upload_images/1871862-eaa996a9bb5fd93d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 关键点

要使用`mCameraDevice.createConstrainedHighSpeedCaptureSession`, 需要注意以下2点:

1.预览尺寸和录制尺寸要一致

2.`CamcorderProfile`的`public static boolean hasProfile(int cameraId, int quality)`方法,只有他返回`true`才意味着当前预览的帧率支持被录制视频.
