package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import d2.AbstractC5699a;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class w implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(InputStream inputStream, M1.b bVar) {
        int c8 = new androidx.exifinterface.media.a(inputStream).c("Orientation", 1);
        if (c8 == 0) {
            return -1;
        }
        return c8;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(ByteBuffer byteBuffer, M1.b bVar) {
        return b(AbstractC5699a.g(byteBuffer), bVar);
    }
}
