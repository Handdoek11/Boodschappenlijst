package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.D;
import d2.AbstractC5699a;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0217a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f12604a;

        C0217a(InputStream inputStream) {
            this.f12604a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f12604a);
            } finally {
                this.f12604a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f12605a;

        b(ByteBuffer byteBuffer) {
            this.f12605a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f12605a);
            } finally {
                AbstractC5699a.d(this.f12605a);
            }
        }
    }

    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f12606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M1.b f12607b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, M1.b bVar) {
            this.f12606a = parcelFileDescriptorRewinder;
            this.f12607b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            D d8;
            D d9 = null;
            try {
                d8 = new D(new FileInputStream(this.f12606a.a().getFileDescriptor()), this.f12607b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType c8 = imageHeaderParser.c(d8);
                d8.f();
                this.f12606a.a();
                return c8;
            } catch (Throwable th2) {
                th = th2;
                d9 = d8;
                if (d9 != null) {
                    d9.f();
                }
                this.f12606a.a();
                throw th;
            }
        }
    }

    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f12608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M1.b f12609b;

        d(ByteBuffer byteBuffer, M1.b bVar) {
            this.f12608a = byteBuffer;
            this.f12609b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f12608a, this.f12609b);
            } finally {
                AbstractC5699a.d(this.f12608a);
            }
        }
    }

    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f12610a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M1.b f12611b;

        e(InputStream inputStream, M1.b bVar) {
            this.f12610a = inputStream;
            this.f12611b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f12610a, this.f12611b);
            } finally {
                this.f12610a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f12612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M1.b f12613b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, M1.b bVar) {
            this.f12612a = parcelFileDescriptorRewinder;
            this.f12613b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            D d8;
            D d9 = null;
            try {
                d8 = new D(new FileInputStream(this.f12612a.a().getFileDescriptor()), this.f12613b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int b8 = imageHeaderParser.b(d8, this.f12613b);
                d8.f();
                this.f12612a.a();
                return b8;
            } catch (Throwable th2) {
                th = th2;
                d9 = d8;
                if (d9 != null) {
                    d9.f();
                }
                this.f12612a.a();
                throw th;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, M1.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, M1.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new D(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, M1.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, g gVar) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            int a8 = gVar.a((ImageHeaderParser) list.get(i8));
            if (a8 != -1) {
                return a8;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, M1.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, M1.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new D(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0217a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            ImageHeaderParser.ImageType a8 = hVar.a((ImageHeaderParser) list.get(i8));
            if (a8 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a8;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
