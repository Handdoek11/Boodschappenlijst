package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import d2.AbstractC5699a;
import d2.AbstractC5709k;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
interface z {

    public static final class a implements z {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f12965a;

        /* renamed from: b, reason: collision with root package name */
        private final List f12966b;

        /* renamed from: c, reason: collision with root package name */
        private final M1.b f12967c;

        a(ByteBuffer byteBuffer, List list, M1.b bVar) {
            this.f12965a = byteBuffer;
            this.f12966b = list;
            this.f12967c = bVar;
        }

        private InputStream e() {
            return AbstractC5699a.g(AbstractC5699a.d(this.f12965a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public int a() {
            return com.bumptech.glide.load.a.c(this.f12966b, AbstractC5699a.d(this.f12965a), this.f12967c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f12966b, AbstractC5699a.d(this.f12965a));
        }
    }

    public static final class b implements z {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f12968a;

        /* renamed from: b, reason: collision with root package name */
        private final M1.b f12969b;

        /* renamed from: c, reason: collision with root package name */
        private final List f12970c;

        b(InputStream inputStream, List list, M1.b bVar) {
            this.f12969b = (M1.b) AbstractC5709k.d(bVar);
            this.f12970c = (List) AbstractC5709k.d(list);
            this.f12968a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public int a() {
            return com.bumptech.glide.load.a.b(this.f12970c, this.f12968a.a(), this.f12969b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f12968a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public void c() {
            this.f12968a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f12970c, this.f12968a.a(), this.f12969b);
        }
    }

    public static final class c implements z {

        /* renamed from: a, reason: collision with root package name */
        private final M1.b f12971a;

        /* renamed from: b, reason: collision with root package name */
        private final List f12972b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f12973c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, M1.b bVar) {
            this.f12971a = (M1.b) AbstractC5709k.d(bVar);
            this.f12972b = (List) AbstractC5709k.d(list);
            this.f12973c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public int a() {
            return com.bumptech.glide.load.a.a(this.f12972b, this.f12973c, this.f12971a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f12973c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.z
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f12972b, this.f12973c, this.f12971a);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
