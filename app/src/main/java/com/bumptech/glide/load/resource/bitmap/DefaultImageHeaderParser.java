package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import d2.AbstractC5709k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f12882a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f12883b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {

        public static final class EndOfFileException extends IOException {
            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i8);

        short c();

        long skip(long j8);
    }

    private static final class a implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f12884a;

        a(ByteBuffer byteBuffer) {
            this.f12884a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i8) {
            int min = Math.min(i8, this.f12884a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f12884a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            if (this.f12884a.remaining() >= 1) {
                return (short) (this.f12884a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j8) {
            int min = (int) Math.min(this.f12884a.remaining(), j8);
            ByteBuffer byteBuffer = this.f12884a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f12885a;

        b(byte[] bArr, int i8) {
            this.f12885a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i8);
        }

        private boolean c(int i8, int i9) {
            return this.f12885a.remaining() - i8 >= i9;
        }

        short a(int i8) {
            if (c(i8, 2)) {
                return this.f12885a.getShort(i8);
            }
            return (short) -1;
        }

        int b(int i8) {
            if (c(i8, 4)) {
                return this.f12885a.getInt(i8);
            }
            return -1;
        }

        int d() {
            return this.f12885a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f12885a.order(byteOrder);
        }
    }

    private static final class c implements Reader {

        /* renamed from: a, reason: collision with root package name */
        private final InputStream f12886a;

        c(InputStream inputStream) {
            this.f12886a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i8) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8 && (i10 = this.f12886a.read(bArr, i9, i8 - i9)) != -1) {
                i9 += i10;
            }
            if (i9 == 0 && i10 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i9;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            int read = this.f12886a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j8) {
            if (j8 < 0) {
                return 0L;
            }
            long j9 = j8;
            while (j9 > 0) {
                long skip = this.f12886a.skip(j9);
                if (skip <= 0) {
                    if (this.f12886a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j9 -= skip;
            }
            return j8 - j9;
        }
    }

    private static int e(int i8, int i9) {
        return i8 + 2 + (i9 * 12);
    }

    private int f(Reader reader, M1.b bVar) {
        try {
            int a8 = reader.a();
            if (!h(a8)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a8);
                }
                return -1;
            }
            int j8 = j(reader);
            if (j8 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.e(j8, byte[].class);
            try {
                return l(reader, bArr, j8);
            } finally {
                bVar.d(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType g(Reader reader) {
        try {
            int a8 = reader.a();
            if (a8 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c8 = (a8 << 8) | reader.c();
            if (c8 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c9 = (c8 << 8) | reader.c();
            if (c9 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (c9 != 1380533830) {
                return m(reader, c9);
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a9 = (reader.a() << 16) | reader.a();
            if ((a9 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i8 = a9 & 255;
            if (i8 == 88) {
                reader.skip(4L);
                short c10 = reader.c();
                return (c10 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (c10 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i8 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i8) {
        return (i8 & 65496) == 65496 || i8 == 19789 || i8 == 18761;
    }

    private boolean i(byte[] bArr, int i8) {
        boolean z7 = bArr != null && i8 > f12882a.length;
        if (z7) {
            int i9 = 0;
            while (true) {
                byte[] bArr2 = f12882a;
                if (i9 >= bArr2.length) {
                    break;
                }
                if (bArr[i9] != bArr2[i9]) {
                    return false;
                }
                i9++;
            }
        }
        return z7;
    }

    private int j(Reader reader) {
        short c8;
        int a8;
        long j8;
        long skip;
        do {
            short c9 = reader.c();
            if (c9 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) c9));
                }
                return -1;
            }
            c8 = reader.c();
            if (c8 == 218) {
                return -1;
            }
            if (c8 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a8 = reader.a() - 2;
            if (c8 == 225) {
                return a8;
            }
            j8 = a8;
            skip = reader.skip(j8);
        } while (skip == j8);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) c8) + ", wanted to skip: " + a8 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a8 = bVar.a(6);
        if (a8 != 18761) {
            if (a8 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) a8));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int b8 = bVar.b(10) + 6;
        short a9 = bVar.a(b8);
        for (int i8 = 0; i8 < a9; i8++) {
            int e8 = e(b8, i8);
            short a10 = bVar.a(e8);
            if (a10 == 274) {
                short a11 = bVar.a(e8 + 2);
                if (a11 >= 1 && a11 <= 12) {
                    int b9 = bVar.b(e8 + 4);
                    if (b9 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i8 + " tagType=" + ((int) a10) + " formatCode=" + ((int) a11) + " componentCount=" + b9);
                        }
                        int i9 = b9 + f12883b[a11];
                        if (i9 <= 4) {
                            int i10 = e8 + 8;
                            if (i10 >= 0 && i10 <= bVar.d()) {
                                if (i9 >= 0 && i9 + i10 <= bVar.d()) {
                                    return bVar.a(i10);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a10));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) a10));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a11));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) a11));
                }
            }
        }
        return -1;
    }

    private int l(Reader reader, byte[] bArr, int i8) {
        int b8 = reader.b(bArr, i8);
        if (b8 == i8) {
            if (i(bArr, i8)) {
                return k(new b(bArr, i8));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i8 + ", actually read: " + b8);
        }
        return -1;
    }

    private ImageHeaderParser.ImageType m(Reader reader, int i8) {
        if (((reader.a() << 16) | reader.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int a8 = (reader.a() << 16) | reader.a();
        if (a8 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i9 = 0;
        boolean z7 = a8 == 1635150182;
        reader.skip(4L);
        int i10 = i8 - 16;
        if (i10 % 4 == 0) {
            while (i9 < 5 && i10 > 0) {
                int a9 = (reader.a() << 16) | reader.a();
                if (a9 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (a9 == 1635150182) {
                    z7 = true;
                }
                i9++;
                i10 -= 4;
            }
        }
        return z7 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return g(new a((ByteBuffer) AbstractC5709k.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(InputStream inputStream, M1.b bVar) {
        return f(new c((InputStream) AbstractC5709k.d(inputStream)), (M1.b) AbstractC5709k.d(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return g(new c((InputStream) AbstractC5709k.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(ByteBuffer byteBuffer, M1.b bVar) {
        return f(new a((ByteBuffer) AbstractC5709k.d(byteBuffer)), (M1.b) AbstractC5709k.d(bVar));
    }
}
