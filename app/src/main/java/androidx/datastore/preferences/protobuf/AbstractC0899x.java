package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0899x {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f9591a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f9592b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f9593c;

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f9594d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0884h f9595e;

    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    public interface a {
        boolean a(int i8);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$b */
    public interface b extends List, RandomAccess {
        void k();

        b u(int i8);

        boolean x0();
    }

    static {
        byte[] bArr = new byte[0];
        f9593c = bArr;
        f9594d = ByteBuffer.wrap(bArr);
        f9595e = AbstractC0884h.h(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z7) {
        return z7 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i8, int i9) {
        int i10 = i(i9, bArr, i8, i9);
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public static int f(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return n0.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((M) obj).f().g((M) obj2).j();
    }

    static int i(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f9591a);
    }
}
