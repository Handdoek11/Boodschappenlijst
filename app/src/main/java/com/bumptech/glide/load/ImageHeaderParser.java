package com.bumptech.glide.load;

import M1.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: o, reason: collision with root package name */
        private final boolean f12602o;

        ImageType(boolean z7) {
            this.f12602o = z7;
        }

        public boolean hasAlpha() {
            return this.f12602o;
        }

        public boolean isWebp() {
            int i8 = a.f12603a[ordinal()];
            return i8 == 1 || i8 == 2 || i8 == 3;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12603a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f12603a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12603a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12603a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, b bVar);

    ImageType c(InputStream inputStream);

    int d(ByteBuffer byteBuffer, b bVar);
}
