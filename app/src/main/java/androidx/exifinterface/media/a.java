package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.b;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public class a {

    /* renamed from: T, reason: collision with root package name */
    private static SimpleDateFormat f9731T;

    /* renamed from: U, reason: collision with root package name */
    private static SimpleDateFormat f9732U;

    /* renamed from: Y, reason: collision with root package name */
    private static final d[] f9736Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final d[] f9737Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final d[] f9738a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final d[] f9739b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final d[] f9740c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final d f9741d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final d[] f9742e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final d[] f9743f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final d[] f9744g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final d[] f9745h0;

    /* renamed from: i0, reason: collision with root package name */
    static final d[][] f9746i0;

    /* renamed from: j0, reason: collision with root package name */
    private static final d[] f9747j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final HashMap[] f9748k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f9749l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final HashSet f9750m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final HashMap f9751n0;

    /* renamed from: o0, reason: collision with root package name */
    static final Charset f9752o0;

    /* renamed from: p0, reason: collision with root package name */
    static final byte[] f9753p0;

    /* renamed from: q0, reason: collision with root package name */
    private static final byte[] f9754q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final Pattern f9755r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f9756s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f9757t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f9759u0;

    /* renamed from: a, reason: collision with root package name */
    private String f9765a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f9766b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f9767c;

    /* renamed from: d, reason: collision with root package name */
    private int f9768d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9769e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap[] f9770f;

    /* renamed from: g, reason: collision with root package name */
    private Set f9771g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f9772h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9773i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9774j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9775k;

    /* renamed from: l, reason: collision with root package name */
    private int f9776l;

    /* renamed from: m, reason: collision with root package name */
    private int f9777m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f9778n;

    /* renamed from: o, reason: collision with root package name */
    private int f9779o;

    /* renamed from: p, reason: collision with root package name */
    private int f9780p;

    /* renamed from: q, reason: collision with root package name */
    private int f9781q;

    /* renamed from: r, reason: collision with root package name */
    private int f9782r;

    /* renamed from: s, reason: collision with root package name */
    private int f9783s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f9784t;

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f9758u = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v, reason: collision with root package name */
    private static final List f9760v = Arrays.asList(1, 6, 3, 8);

    /* renamed from: w, reason: collision with root package name */
    private static final List f9761w = Arrays.asList(2, 7, 4, 5);

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f9762x = {8, 8, 8};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9763y = {4};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f9764z = {8};

    /* renamed from: A, reason: collision with root package name */
    static final byte[] f9712A = {-1, -40, -1};

    /* renamed from: B, reason: collision with root package name */
    private static final byte[] f9713B = {102, 116, 121, 112};

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f9714C = {109, 105, 102, 49};

    /* renamed from: D, reason: collision with root package name */
    private static final byte[] f9715D = {104, 101, 105, 99};

    /* renamed from: E, reason: collision with root package name */
    private static final byte[] f9716E = {79, 76, 89, 77, 80, 0};

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f9717F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f9718G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f9719H = {101, 88, 73, 102};

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f9720I = {73, 72, 68, 82};

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f9721J = {73, 69, 78, 68};

    /* renamed from: K, reason: collision with root package name */
    private static final byte[] f9722K = {82, 73, 70, 70};

    /* renamed from: L, reason: collision with root package name */
    private static final byte[] f9723L = {87, 69, 66, 80};

    /* renamed from: M, reason: collision with root package name */
    private static final byte[] f9724M = {69, 88, 73, 70};

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f9725N = {-99, 1, 42};

    /* renamed from: O, reason: collision with root package name */
    private static final byte[] f9726O = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    private static final byte[] f9727P = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    private static final byte[] f9728Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    private static final byte[] f9729R = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f9730S = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: V, reason: collision with root package name */
    static final String[] f9733V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: W, reason: collision with root package name */
    static final int[] f9734W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: X, reason: collision with root package name */
    static final byte[] f9735X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    class C0162a extends MediaDataSource {

        /* renamed from: o, reason: collision with root package name */
        long f9785o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ f f9786s;

        C0162a(f fVar) {
            this.f9786s = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j8, byte[] bArr, int i8, int i9) {
            if (i9 == 0) {
                return 0;
            }
            if (j8 < 0) {
                return -1;
            }
            try {
                long j9 = this.f9785o;
                if (j9 != j8) {
                    if (j9 >= 0 && j8 >= j9 + this.f9786s.available()) {
                        return -1;
                    }
                    this.f9786s.i(j8);
                    this.f9785o = j8;
                }
                if (i9 > this.f9786s.available()) {
                    i9 = this.f9786s.available();
                }
                int read = this.f9786s.read(bArr, i8, i9);
                if (read >= 0) {
                    this.f9785o += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f9785o = -1L;
            return -1;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f9793a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9794b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9795c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f9796d;

        c(int i8, int i9, byte[] bArr) {
            this(i8, i9, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f9752o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j8, ByteOrder byteOrder) {
            return c(new long[]{j8}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f9734W[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j8 : jArr) {
                wrap.putInt((int) j8);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f9734W[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f9801a);
                wrap.putInt((int) eVar.f9802b);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c f(int i8, ByteOrder byteOrder) {
            return g(new int[]{i8}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f9734W[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i8 : iArr) {
                wrap.putShort((short) i8);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public double h(ByteOrder byteOrder) {
            Object k8 = k(byteOrder);
            if (k8 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (k8 instanceof String) {
                return Double.parseDouble((String) k8);
            }
            if (k8 instanceof long[]) {
                if (((long[]) k8).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k8 instanceof int[]) {
                if (((int[]) k8).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (k8 instanceof double[]) {
                double[] dArr = (double[]) k8;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k8 instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) k8;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) {
            Object k8 = k(byteOrder);
            if (k8 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (k8 instanceof String) {
                return Integer.parseInt((String) k8);
            }
            if (k8 instanceof long[]) {
                long[] jArr = (long[]) k8;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(k8 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) k8;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) {
            Object k8 = k(byteOrder);
            if (k8 == null) {
                return null;
            }
            if (k8 instanceof String) {
                return (String) k8;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            if (k8 instanceof long[]) {
                long[] jArr = (long[]) k8;
                while (i8 < jArr.length) {
                    sb.append(jArr[i8]);
                    i8++;
                    if (i8 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k8 instanceof int[]) {
                int[] iArr = (int[]) k8;
                while (i8 < iArr.length) {
                    sb.append(iArr[i8]);
                    i8++;
                    if (i8 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (k8 instanceof double[]) {
                double[] dArr = (double[]) k8;
                while (i8 < dArr.length) {
                    sb.append(dArr[i8]);
                    i8++;
                    if (i8 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(k8 instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) k8;
            while (i8 < eVarArr.length) {
                sb.append(eVarArr[i8].f9801a);
                sb.append('/');
                sb.append(eVarArr[i8].f9802b);
                i8++;
                if (i8 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:17:0x0030 */
        /* JADX WARN: Removed duplicated region for block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object k(java.nio.ByteOrder r12) {
            /*
                Method dump skipped, instructions count: 436
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.c.k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + a.f9733V[this.f9793a] + ", data length:" + this.f9796d.length + ")";
        }

        c(int i8, int i9, long j8, byte[] bArr) {
            this.f9793a = i8;
            this.f9794b = i9;
            this.f9795c = j8;
            this.f9796d = bArr;
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final long f9801a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9802b;

        e(long j8, long j9) {
            if (j9 == 0) {
                this.f9801a = 0L;
                this.f9802b = 1L;
            } else {
                this.f9801a = j8;
                this.f9802b = j9;
            }
        }

        public double a() {
            return this.f9801a / this.f9802b;
        }

        public String toString() {
            return this.f9801a + "/" + this.f9802b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f9736Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f9737Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f9738a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f9739b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f9740c0 = dVarArr5;
        f9741d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f9742e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f9743f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f9744g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f9745h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f9746i0 = dVarArr10;
        f9747j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f9748k0 = new HashMap[dVarArr10.length];
        f9749l0 = new HashMap[dVarArr10.length];
        f9750m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f9751n0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f9752o0 = forName;
        f9753p0 = "Exif\u0000\u0000".getBytes(forName);
        f9754q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f9731T = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f9732U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i8 = 0;
        while (true) {
            d[][] dVarArr11 = f9746i0;
            if (i8 >= dVarArr11.length) {
                HashMap hashMap = f9751n0;
                d[] dVarArr12 = f9747j0;
                hashMap.put(Integer.valueOf(dVarArr12[0].f9797a), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f9797a), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f9797a), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f9797a), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f9797a), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f9797a), 8);
                f9755r0 = Pattern.compile(".*[1-9].*");
                f9756s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f9757t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f9759u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f9748k0[i8] = new HashMap();
            f9749l0[i8] = new HashMap();
            for (d dVar : dVarArr11[i8]) {
                f9748k0[i8].put(Integer.valueOf(dVar.f9797a), dVar);
                f9749l0[i8].put(dVar.f9798b, dVar);
            }
            i8++;
        }
    }

    public a(FileDescriptor fileDescriptor) {
        boolean z7;
        FileInputStream fileInputStream;
        Throwable th;
        d[][] dVarArr = f9746i0;
        this.f9770f = new HashMap[dVarArr.length];
        this.f9771g = new HashSet(dVarArr.length);
        this.f9772h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor == null) {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
        this.f9767c = null;
        this.f9765a = null;
        if (x(fileDescriptor)) {
            this.f9766b = fileDescriptor;
            try {
                fileDescriptor = b.a.b(fileDescriptor);
                z7 = true;
            } catch (Exception e8) {
                throw new IOException("Failed to duplicate file descriptor", e8);
            }
        } else {
            this.f9766b = null;
            z7 = false;
        }
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            B(fileInputStream);
            androidx.exifinterface.media.b.b(fileInputStream);
            if (z7) {
                androidx.exifinterface.media.b.a(fileDescriptor);
            }
        } catch (Throwable th3) {
            th = th3;
            androidx.exifinterface.media.b.b(fileInputStream);
            if (z7) {
                androidx.exifinterface.media.b.a(fileDescriptor);
            }
            throw th;
        }
    }

    private boolean A(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f9722K;
            if (i8 >= bArr2.length) {
                int i9 = 0;
                while (true) {
                    byte[] bArr3 = f9723L;
                    if (i9 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f9722K.length + i9 + 4] != bArr3[i9]) {
                        return false;
                    }
                    i9++;
                }
            } else {
                if (bArr[i8] != bArr2[i8]) {
                    return false;
                }
                i8++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:47:0x009b, B:49:0x009f), top: B:60:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void B(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb8
            r0 = 0
            r1 = r0
        L4:
            androidx.exifinterface.media.a$d[][] r2 = androidx.exifinterface.media.a.f9746i0     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 >= r2) goto L1e
            java.util.HashMap[] r2 = r4.f9770f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2[r1] = r3     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r1 + 1
            goto L4
        L15:
            r5 = move-exception
            goto Lad
        L18:
            r5 = move-exception
            goto L9b
        L1b:
            r5 = move-exception
            goto L9b
        L1e:
            boolean r1 = r4.f9769e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 != 0) goto L30
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.g(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.f9768d = r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r5 = r1
        L30:
            int r1 = r4.f9768d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r1 = K(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r1 == 0) goto L6b
            androidx.exifinterface.media.a$f r0 = new androidx.exifinterface.media.a$f     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            boolean r5 = r4.f9769e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r5 == 0) goto L45
            r4.m(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L45:
            int r5 = r4.f9768d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1 = 12
            if (r5 != r1) goto L4f
            r4.e(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L4f:
            r1 = 7
            if (r5 != r1) goto L56
            r4.h(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L56:
            r1 = 10
            if (r5 != r1) goto L5e
            r4.l(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L61
        L5e:
            r4.k(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L61:
            int r5 = r4.f9780p     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r0.i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.J(r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L6b:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r5 = r4.f9768d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 4
            if (r5 != r2) goto L79
            r4.f(r1, r0, r0)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L79:
            r0 = 13
            if (r5 != r0) goto L81
            r4.i(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L81:
            r0 = 9
            if (r5 != r0) goto L89
            r4.j(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L90
        L89:
            r0 = 14
            if (r5 != r0) goto L90
            r4.n(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L90:
            r4.a()
            boolean r5 = androidx.exifinterface.media.a.f9758u
            if (r5 == 0) goto Lac
        L97:
            r4.D()
            goto Lac
        L9b:
            boolean r0 = androidx.exifinterface.media.a.f9758u     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch: java.lang.Throwable -> L15
        La6:
            r4.a()
            if (r0 == 0) goto Lac
            goto L97
        Lac:
            return
        Lad:
            r4.a()
            boolean r0 = androidx.exifinterface.media.a.f9758u
            if (r0 == 0) goto Lb7
            r4.D()
        Lb7:
            throw r5
        Lb8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.B(java.io.InputStream):void");
    }

    private void C(b bVar) {
        ByteOrder E7 = E(bVar);
        this.f9772h = E7;
        bVar.g(E7);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i8 = this.f9768d;
        if (i8 != 7 && i8 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i9 = readInt - 8;
        if (i9 > 0) {
            bVar.h(i9);
        }
    }

    private void D() {
        for (int i8 = 0; i8 < this.f9770f.length; i8++) {
            Log.d("ExifInterface", "The size of tag group[" + i8 + "]: " + this.f9770f[i8].size());
            for (Map.Entry entry : this.f9770f[i8].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f9772h) + "'");
            }
        }
    }

    private ByteOrder E(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f9758u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f9758u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void F(byte[] bArr, int i8) {
        f fVar = new f(bArr);
        C(fVar);
        G(fVar, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void G(androidx.exifinterface.media.a.f r29, int r30) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.G(androidx.exifinterface.media.a$f, int):void");
    }

    private void H(int i8, String str, String str2) {
        if (this.f9770f[i8].isEmpty() || this.f9770f[i8].get(str) == null) {
            return;
        }
        HashMap hashMap = this.f9770f[i8];
        hashMap.put(str2, hashMap.get(str));
        this.f9770f[i8].remove(str);
    }

    private void I(f fVar, int i8) {
        c cVar = (c) this.f9770f[i8].get("ImageLength");
        c cVar2 = (c) this.f9770f[i8].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f9770f[i8].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f9770f[i8].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i9 = cVar3.i(this.f9772h);
            int i10 = cVar3.i(this.f9772h);
            fVar.i(i9);
            byte[] bArr = new byte[i10];
            fVar.readFully(bArr);
            f(new b(bArr), i9, i8);
        }
    }

    private void J(b bVar) {
        HashMap hashMap = this.f9770f[4];
        c cVar = (c) hashMap.get("Compression");
        if (cVar == null) {
            this.f9779o = 6;
            o(bVar, hashMap);
            return;
        }
        int i8 = cVar.i(this.f9772h);
        this.f9779o = i8;
        if (i8 != 1) {
            if (i8 == 6) {
                o(bVar, hashMap);
                return;
            } else if (i8 != 7) {
                return;
            }
        }
        if (y(hashMap)) {
            p(bVar, hashMap);
        }
    }

    private static boolean K(int i8) {
        return (i8 == 4 || i8 == 9 || i8 == 13 || i8 == 14) ? false : true;
    }

    private void L(int i8, int i9) {
        if (this.f9770f[i8].isEmpty() || this.f9770f[i9].isEmpty()) {
            if (f9758u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f9770f[i8].get("ImageLength");
        c cVar2 = (c) this.f9770f[i8].get("ImageWidth");
        c cVar3 = (c) this.f9770f[i9].get("ImageLength");
        c cVar4 = (c) this.f9770f[i9].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f9758u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f9758u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i10 = cVar.i(this.f9772h);
        int i11 = cVar2.i(this.f9772h);
        int i12 = cVar3.i(this.f9772h);
        int i13 = cVar4.i(this.f9772h);
        if (i10 >= i12 || i11 >= i13) {
            return;
        }
        HashMap[] hashMapArr = this.f9770f;
        HashMap hashMap = hashMapArr[i8];
        hashMapArr[i8] = hashMapArr[i9];
        hashMapArr[i9] = hashMap;
    }

    private void M(f fVar, int i8) {
        c f8;
        c f9;
        c cVar = (c) this.f9770f[i8].get("DefaultCropSize");
        c cVar2 = (c) this.f9770f[i8].get("SensorTopBorder");
        c cVar3 = (c) this.f9770f[i8].get("SensorLeftBorder");
        c cVar4 = (c) this.f9770f[i8].get("SensorBottomBorder");
        c cVar5 = (c) this.f9770f[i8].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                I(fVar, i8);
                return;
            }
            int i9 = cVar2.i(this.f9772h);
            int i10 = cVar4.i(this.f9772h);
            int i11 = cVar5.i(this.f9772h);
            int i12 = cVar3.i(this.f9772h);
            if (i10 <= i9 || i11 <= i12) {
                return;
            }
            c f10 = c.f(i10 - i9, this.f9772h);
            c f11 = c.f(i11 - i12, this.f9772h);
            this.f9770f[i8].put("ImageLength", f10);
            this.f9770f[i8].put("ImageWidth", f11);
            return;
        }
        if (cVar.f9793a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f9772h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            f8 = c.d(eVarArr[0], this.f9772h);
            f9 = c.d(eVarArr[1], this.f9772h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f9772h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            f8 = c.f(iArr[0], this.f9772h);
            f9 = c.f(iArr[1], this.f9772h);
        }
        this.f9770f[i8].put("ImageWidth", f8);
        this.f9770f[i8].put("ImageLength", f9);
    }

    private void N() {
        L(0, 5);
        L(0, 4);
        L(5, 4);
        c cVar = (c) this.f9770f[1].get("PixelXDimension");
        c cVar2 = (c) this.f9770f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f9770f[0].put("ImageWidth", cVar);
            this.f9770f[0].put("ImageLength", cVar2);
        }
        if (this.f9770f[4].isEmpty() && z(this.f9770f[5])) {
            HashMap[] hashMapArr = this.f9770f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!z(this.f9770f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        H(0, "ThumbnailOrientation", "Orientation");
        H(0, "ThumbnailImageLength", "ImageLength");
        H(0, "ThumbnailImageWidth", "ImageWidth");
        H(5, "ThumbnailOrientation", "Orientation");
        H(5, "ThumbnailImageLength", "ImageLength");
        H(5, "ThumbnailImageWidth", "ImageWidth");
        H(4, "Orientation", "ThumbnailOrientation");
        H(4, "ImageLength", "ThumbnailImageLength");
        H(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String b8 = b("DateTimeOriginal");
        if (b8 != null && b("DateTime") == null) {
            this.f9770f[0].put("DateTime", c.a(b8));
        }
        if (b("ImageWidth") == null) {
            this.f9770f[0].put("ImageWidth", c.b(0L, this.f9772h));
        }
        if (b("ImageLength") == null) {
            this.f9770f[0].put("ImageLength", c.b(0L, this.f9772h));
        }
        if (b("Orientation") == null) {
            this.f9770f[0].put("Orientation", c.b(0L, this.f9772h));
        }
        if (b("LightSource") == null) {
            this.f9770f[1].put("LightSource", c.b(0L, this.f9772h));
        }
    }

    private c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f9758u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i8 = 0; i8 < f9746i0.length; i8++) {
            c cVar = (c) this.f9770f[i8].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void e(f fVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0163b.a(mediaMetadataRetriever, new C0162a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f9770f[0].put("ImageWidth", c.f(Integer.parseInt(str), this.f9772h));
                }
                if (str2 != null) {
                    this.f9770f[0].put("ImageLength", c.f(Integer.parseInt(str2), this.f9772h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f9770f[0].put("Orientation", c.f(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f9772h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.i(parseInt2);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i8 = parseInt2 + 6;
                    int i9 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f9753p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i9];
                    fVar.readFully(bArr2);
                    this.f9780p = i8;
                    F(bArr2, 0);
                }
                if (f9758u) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        r22.g(r21.f9772h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0170 A[LOOP:0: B:10:0x0037->B:59:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(androidx.exifinterface.media.a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.f(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (s(bArr)) {
            return 4;
        }
        if (v(bArr)) {
            return 9;
        }
        if (r(bArr)) {
            return 12;
        }
        if (t(bArr)) {
            return 7;
        }
        if (w(bArr)) {
            return 10;
        }
        if (u(bArr)) {
            return 13;
        }
        return A(bArr) ? 14 : 0;
    }

    private void h(f fVar) {
        int i8;
        int i9;
        k(fVar);
        c cVar = (c) this.f9770f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f9796d);
            fVar2.g(this.f9772h);
            byte[] bArr = f9716E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.i(0L);
            byte[] bArr3 = f9717F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.i(12L);
            }
            G(fVar2, 6);
            c cVar2 = (c) this.f9770f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f9770f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f9770f[5].put("JPEGInterchangeFormat", cVar2);
                this.f9770f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f9770f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f9772h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i10 = iArr[2];
                int i11 = iArr[0];
                if (i10 <= i11 || (i8 = iArr[3]) <= (i9 = iArr[1])) {
                    return;
                }
                int i12 = (i10 - i11) + 1;
                int i13 = (i8 - i9) + 1;
                if (i12 < i13) {
                    int i14 = i12 + i13;
                    i13 = i14 - i13;
                    i12 = i14 - i13;
                }
                c f8 = c.f(i12, this.f9772h);
                c f9 = c.f(i13, this.f9772h);
                this.f9770f[0].put("ImageWidth", f8);
                this.f9770f[0].put("ImageLength", f9);
            }
        }
    }

    private void i(b bVar) {
        if (f9758u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.g(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f9718G;
        bVar.h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i8 = length + 8;
                if (i8 == 16 && !Arrays.equals(bArr2, f9720I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f9721J)) {
                    return;
                }
                if (Arrays.equals(bArr2, f9719H)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f9780p = i8;
                        F(bArr3, 0);
                        N();
                        J(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i9 = readInt + 4;
                bVar.h(i9);
                length = i8 + i9;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) {
        boolean z7 = f9758u;
        if (z7) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i8 = ByteBuffer.wrap(bArr).getInt();
        int i9 = ByteBuffer.wrap(bArr2).getInt();
        int i10 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i9];
        bVar.h(i8 - bVar.e());
        bVar.readFully(bArr4);
        f(new b(bArr4), i8, 5);
        bVar.h(i10 - bVar.e());
        bVar.g(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z7) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i11 = 0; i11 < readInt; i11++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f9741d0.f9797a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c f8 = c.f(readShort, this.f9772h);
                c f9 = c.f(readShort2, this.f9772h);
                this.f9770f[0].put("ImageLength", f8);
                this.f9770f[0].put("ImageWidth", f9);
                if (f9758u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.h(readUnsignedShort2);
        }
    }

    private void k(f fVar) {
        c cVar;
        C(fVar);
        G(fVar, 0);
        M(fVar, 0);
        M(fVar, 5);
        M(fVar, 4);
        N();
        if (this.f9768d != 8 || (cVar = (c) this.f9770f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f9796d);
        fVar2.g(this.f9772h);
        fVar2.h(6);
        G(fVar2, 9);
        c cVar2 = (c) this.f9770f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f9770f[1].put("ColorSpace", cVar2);
        }
    }

    private void l(f fVar) {
        if (f9758u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = (c) this.f9770f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f9796d), (int) cVar.f9795c, 5);
        }
        c cVar2 = (c) this.f9770f[0].get("ISO");
        c cVar3 = (c) this.f9770f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f9770f[1].put("PhotographicSensitivity", cVar2);
    }

    private void m(f fVar) {
        byte[] bArr = f9753p0;
        fVar.h(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f9780p = bArr.length;
        F(bArr2, 0);
    }

    private void n(b bVar) {
        if (f9758u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.g(ByteOrder.LITTLE_ENDIAN);
        bVar.h(f9722K.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f9723L;
        bVar.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i8 = length + 8;
                if (Arrays.equals(f9724M, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f9780p = i8;
                    F(bArr3, 0);
                    J(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i8 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.h(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void o(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i8 = cVar.i(this.f9772h);
        int i9 = cVar2.i(this.f9772h);
        if (this.f9768d == 7) {
            i8 += this.f9781q;
        }
        if (i8 > 0 && i9 > 0) {
            this.f9773i = true;
            if (this.f9765a == null && this.f9767c == null && this.f9766b == null) {
                byte[] bArr = new byte[i9];
                bVar.h(i8);
                bVar.readFully(bArr);
                this.f9778n = bArr;
            }
            this.f9776l = i8;
            this.f9777m = i9;
        }
        if (f9758u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i8 + ", length: " + i9);
        }
    }

    private void p(b bVar, HashMap hashMap) {
        byte[] bArr;
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] c8 = androidx.exifinterface.media.b.c(cVar.k(this.f9772h));
        long[] c9 = androidx.exifinterface.media.b.c(cVar2.k(this.f9772h));
        if (c8 == null || c8.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (c9 == null || c9.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (c8.length != c9.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j8 = 0;
        for (long j9 : c9) {
            j8 += j9;
        }
        int i8 = (int) j8;
        byte[] bArr2 = new byte[i8];
        this.f9775k = true;
        this.f9774j = true;
        this.f9773i = true;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < c8.length) {
            int i12 = (int) c8[i9];
            int i13 = (int) c9[i9];
            if (i9 < c8.length - 1) {
                bArr = bArr2;
                if (i12 + i13 != c8[i9 + 1]) {
                    this.f9775k = false;
                }
            } else {
                bArr = bArr2;
            }
            int i14 = i12 - i10;
            if (i14 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.h(i14);
                int i15 = i10 + i14;
                byte[] bArr3 = new byte[i13];
                try {
                    bVar.readFully(bArr3);
                    i10 = i15 + i13;
                    byte[] bArr4 = bArr;
                    System.arraycopy(bArr3, 0, bArr4, i11, i13);
                    i11 += i13;
                    i9++;
                    bArr2 = bArr4;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                return;
            }
        }
        this.f9778n = bArr2;
        if (this.f9775k) {
            this.f9776l = (int) c8[0];
            this.f9777m = i8;
        }
    }

    private static boolean q(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f9753p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr3 = f9753p0;
            if (i8 >= bArr3.length) {
                return true;
            }
            if (bArr2[i8] != bArr3[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean r(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j8;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.readFully(bArr2);
                } catch (Exception e8) {
                    e = e8;
                    bVar2 = bVar;
                    if (f9758u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
        }
        if (!Arrays.equals(bArr2, f9713B)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j8 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j8 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j9 = readInt - j8;
        if (j9 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z7 = false;
        boolean z8 = false;
        for (long j10 = 0; j10 < j9 / 4; j10++) {
            try {
                bVar.readFully(bArr3);
                if (j10 != 1) {
                    if (Arrays.equals(bArr3, f9714C)) {
                        z7 = true;
                    } else if (Arrays.equals(bArr3, f9715D)) {
                        z8 = true;
                    }
                    if (z7 && z8) {
                        bVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return false;
            }
        }
        bVar.close();
        return false;
    }

    private static boolean s(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f9712A;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean t(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder E7 = E(bVar);
            this.f9772h = E7;
            bVar.g(E7);
            short readShort = bVar.readShort();
            boolean z7 = readShort == 20306 || readShort == 21330;
            bVar.close();
            return z7;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private boolean u(byte[] bArr) {
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f9718G;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    private boolean v(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i8 = 0; i8 < bytes.length; i8++) {
            if (bArr[i8] != bytes[i8]) {
                return false;
            }
        }
        return true;
    }

    private boolean w(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder E7 = E(bVar);
            this.f9772h = E7;
            bVar.g(E7);
            boolean z7 = bVar.readShort() == 85;
            bVar.close();
            return z7;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    private static boolean x(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f9758u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean y(HashMap hashMap) {
        c cVar;
        int i8;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f9772h);
            int[] iArr2 = f9762x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f9768d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((i8 = cVar.i(this.f9772h)) == 1 && Arrays.equals(iArr, f9764z)) || (i8 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f9758u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean z(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f9772h) <= 512 && cVar2.i(this.f9772h) <= 512;
    }

    public String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c d8 = d(str);
        if (d8 != null) {
            if (!f9750m0.contains(str)) {
                return d8.j(this.f9772h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i8 = d8.f9793a;
                if (i8 != 5 && i8 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + d8.f9793a);
                    return null;
                }
                e[] eVarArr = (e[]) d8.k(this.f9772h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f9801a / eVar.f9802b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f9801a / eVar2.f9802b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f9801a / eVar3.f9802b)));
            }
            try {
                return Double.toString(d8.h(this.f9772h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i8) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c d8 = d(str);
        if (d8 == null) {
            return i8;
        }
        try {
            return d8.i(this.f9772h);
        } catch (NumberFormatException unused) {
            return i8;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: o, reason: collision with root package name */
        protected final DataInputStream f9788o;

        /* renamed from: s, reason: collision with root package name */
        protected int f9789s;

        /* renamed from: t, reason: collision with root package name */
        private ByteOrder f9790t;

        /* renamed from: u, reason: collision with root package name */
        private byte[] f9791u;

        /* renamed from: v, reason: collision with root package name */
        private int f9792v;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f9792v = bArr.length;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f9788o.available();
        }

        public int d() {
            return this.f9792v;
        }

        public int e() {
            return this.f9789s;
        }

        public long f() {
            return readInt() & 4294967295L;
        }

        public void g(ByteOrder byteOrder) {
            this.f9790t = byteOrder;
        }

        public void h(int i8) {
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i8 - i9;
                int skip = (int) this.f9788o.skip(i10);
                if (skip <= 0) {
                    if (this.f9791u == null) {
                        this.f9791u = new byte[8192];
                    }
                    skip = this.f9788o.read(this.f9791u, 0, Math.min(8192, i10));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i8 + " bytes.");
                    }
                }
                i9 += skip;
            }
            this.f9789s += i9;
        }

        @Override // java.io.InputStream
        public void mark(int i8) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f9789s++;
            return this.f9788o.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f9789s++;
            return this.f9788o.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f9789s++;
            int read = this.f9788o.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f9789s += 2;
            return this.f9788o.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i8, int i9) {
            this.f9789s += i9;
            this.f9788o.readFully(bArr, i8, i9);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f9789s += 4;
            int read = this.f9788o.read();
            int read2 = this.f9788o.read();
            int read3 = this.f9788o.read();
            int read4 = this.f9788o.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9790t;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f9790t);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f9789s += 8;
            int read = this.f9788o.read();
            int read2 = this.f9788o.read();
            int read3 = this.f9788o.read();
            int read4 = this.f9788o.read();
            int read5 = this.f9788o.read();
            int read6 = this.f9788o.read();
            int read7 = this.f9788o.read();
            int read8 = this.f9788o.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9790t;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f9790t);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f9789s += 2;
            int read = this.f9788o.read();
            int read2 = this.f9788o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9790t;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f9790t);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f9789s += 2;
            return this.f9788o.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f9789s++;
            return this.f9788o.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f9789s += 2;
            int read = this.f9788o.read();
            int read2 = this.f9788o.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f9790t;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f9790t);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i8) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            int read = this.f9788o.read(bArr, i8, i9);
            this.f9789s += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f9789s += bArr.length;
            this.f9788o.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f9788o = dataInputStream;
            dataInputStream.mark(0);
            this.f9789s = 0;
            this.f9790t = byteOrder;
            this.f9792v = inputStream instanceof b ? ((b) inputStream).d() : -1;
        }
    }

    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f9788o.mark(Integer.MAX_VALUE);
        }

        public void i(long j8) {
            int i8 = this.f9789s;
            if (i8 > j8) {
                this.f9789s = 0;
                this.f9788o.reset();
            } else {
                j8 -= i8;
            }
            h((int) j8);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f9788o.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f9797a;

        /* renamed from: b, reason: collision with root package name */
        public final String f9798b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9799c;

        /* renamed from: d, reason: collision with root package name */
        public final int f9800d;

        d(String str, int i8, int i9) {
            this.f9798b = str;
            this.f9797a = i8;
            this.f9799c = i9;
            this.f9800d = -1;
        }

        boolean a(int i8) {
            int i9;
            int i10 = this.f9799c;
            if (i10 == 7 || i8 == 7 || i10 == i8 || (i9 = this.f9800d) == i8) {
                return true;
            }
            if ((i10 == 4 || i9 == 4) && i8 == 3) {
                return true;
            }
            if ((i10 == 9 || i9 == 9) && i8 == 8) {
                return true;
            }
            return (i10 == 12 || i9 == 12) && i8 == 11;
        }

        d(String str, int i8, int i9, int i10) {
            this.f9798b = str;
            this.f9797a = i8;
            this.f9799c = i9;
            this.f9800d = i10;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.io.InputStream r4, int r5) {
        /*
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.a$d[][] r0 = androidx.exifinterface.media.a.f9746i0
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f9770f = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f9771g = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f9772h = r0
            if (r4 == 0) goto L6a
            r0 = 0
            r3.f9765a = r0
            r1 = 1
            if (r5 != r1) goto L3c
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.a.f9753p0
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = q(r5)
            if (r4 != 0) goto L34
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L34:
            r3.f9769e = r1
            r3.f9767c = r0
            r3.f9766b = r0
            r4 = r5
            goto L66
        L3c:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L48
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f9767c = r5
            r3.f9766b = r0
            goto L66
        L48:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L62
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = x(r1)
            if (r1 == 0) goto L62
            r3.f9767c = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f9766b = r5
            goto L66
        L62:
            r3.f9767c = r0
            r3.f9766b = r0
        L66:
            r3.B(r4)
            return
        L6a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.<init>(java.io.InputStream, int):void");
    }
}
