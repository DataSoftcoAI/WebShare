package ss.nscube.webshare.utils.scan.models

import android.net.Uri

class Video(
    override val name: String,
    override val length: Long,
    val duration: Int,
    override val uri: Uri,
    val date: Long
): Data()