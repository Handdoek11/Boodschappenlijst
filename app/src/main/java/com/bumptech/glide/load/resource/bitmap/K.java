package com.bumptech.glide.load.resource.bitmap;

import J1.g;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class K implements J1.j {

    /* renamed from: d, reason: collision with root package name */
    public static final J1.g f12902d = J1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final J1.g f12903e = J1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final f f12904f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final List f12905g = DesugarCollections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    private final e f12906a;

    /* renamed from: b, reason: collision with root package name */
    private final M1.d f12907b;

    /* renamed from: c, reason: collision with root package name */
    private final f f12908c;

    class a implements g.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f12909a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // J1.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l8, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f12909a) {
                this.f12909a.position(0);
                messageDigest.update(this.f12909a.putLong(l8.longValue()).array());
            }
        }
    }

    class b implements g.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f12910a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // J1.g.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f12910a) {
                this.f12910a.position(0);
                messageDigest.update(this.f12910a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements e {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static final class d implements e {

        class a extends MediaDataSource {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f12911o;

            a(ByteBuffer byteBuffer) {
                this.f12911o = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f12911o.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j8, byte[] bArr, int i8, int i9) {
                if (j8 >= this.f12911o.limit()) {
                    return -1;
                }
                this.f12911o.position((int) j8);
                int min = Math.min(i9, this.f12911o.remaining());
                this.f12911o.get(bArr, i8, min);
                return min;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    interface e {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    static final class g implements e {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    K(M1.d dVar, e eVar) {
        this(dVar, eVar, f12904f);
    }

    public static J1.j c(M1.d dVar) {
        return new K(dVar, new c(null));
    }

    public static J1.j d(M1.d dVar) {
        return new K(dVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        return bitmap;
    }

    private Bitmap f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j8, int i8, int i9, int i10, n nVar) {
        if (l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap h8 = (Build.VERSION.SDK_INT < 27 || i9 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || nVar == n.f12932f) ? null : h(mediaMetadataRetriever, j8, i8, i9, i10, nVar);
        if (h8 == null) {
            h8 = g(mediaMetadataRetriever, j8, i8);
        }
        Bitmap e8 = e(mediaMetadataRetriever, h8);
        if (e8 != null) {
            return e8;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j8, int i8) {
        return mediaMetadataRetriever.getFrameAtTime(j8, i8);
    }

    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j8, int i8, int i9, int i10, n nVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b8 = nVar.b(parseInt, parseInt2, i9, i10);
            return mediaMetadataRetriever.getScaledFrameAtTime(j8, i8, Math.round(parseInt * b8), Math.round(b8 * parseInt2));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i8 = Build.VERSION.SDK_INT;
        return i8 >= 30 && i8 < 33;
    }

    private static boolean k() {
        Iterator it = f12905g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f12906a.a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i8 = 0; i8 < trackCount; i8++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i8).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th2) {
            th = th2;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public static J1.j m(M1.d dVar) {
        return new K(dVar, new g());
    }

    @Override // J1.j
    public L1.c a(Object obj, int i8, int i9, J1.h hVar) {
        long longValue = ((Long) hVar.c(f12902d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.c(f12903e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) hVar.c(n.f12934h);
        if (nVar == null) {
            nVar = n.f12933g;
        }
        n nVar2 = nVar;
        MediaMetadataRetriever a8 = this.f12908c.a();
        try {
            this.f12906a.b(a8, obj);
            return C1083g.f(f(obj, a8, longValue, num.intValue(), i8, i9, nVar2), this.f12907b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                a8.release();
            } else {
                a8.release();
            }
        }
    }

    @Override // J1.j
    public boolean b(Object obj, J1.h hVar) {
        return true;
    }

    K(M1.d dVar, e eVar, f fVar) {
        this.f12907b = dVar;
        this.f12906a = eVar;
        this.f12908c = fVar;
    }
}
