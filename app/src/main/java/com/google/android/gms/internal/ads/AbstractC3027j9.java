package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3027j9 {

    /* renamed from: a, reason: collision with root package name */
    static boolean f23195a = false;

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f23196b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f23197c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f23198d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final CountDownLatch f23199e = new CountDownLatch(1);

    static T8 a(byte[] bArr, String str) {
        Vector c8 = c(bArr, 255);
        if (c8 == null || c8.isEmpty()) {
            return null;
        }
        T8 b02 = U8.b0();
        int size = c8.size();
        for (int i8 = 0; i8 < size; i8++) {
            b02.C(AbstractC3542nu0.H(h((byte[]) c8.get(i8), str, false), 0, 256));
        }
        byte[] f8 = f(bArr);
        AbstractC3542nu0 abstractC3542nu0 = AbstractC3542nu0.f25048s;
        b02.D(AbstractC3542nu0.H(f8, 0, f8.length));
        return b02;
    }

    static String b(byte[] bArr, String str) {
        T8 a8 = a(bArr, str);
        return Y8.a(a8 == null ? h(g(4096).m(), str, true) : ((U8) a8.x()).m(), true);
    }

    static Vector c(byte[] bArr, int i8) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i9 = length + 254;
        Vector vector = new Vector();
        for (int i10 = 0; i10 < i9 / 255; i10++) {
            int i11 = i10 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i11 > 255) {
                    length2 = i11 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i11, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    static void e() {
        synchronized (f23198d) {
            try {
                if (!f23195a) {
                    f23195a = true;
                    new Thread(new RunnableC2811h9(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] f(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (f23197c) {
            try {
                e();
                MessageDigest messageDigest2 = null;
                try {
                    if (f23199e.await(2L, TimeUnit.SECONDS) && (messageDigest = f23196b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                digest = f23196b.digest();
            } finally {
            }
        }
        return digest;
    }

    static E8 g(int i8) {
        C2918i8 B02 = E8.B0();
        B02.F(4096L);
        return (E8) B02.x();
    }

    private static byte[] h(byte[] bArr, String str, boolean z7) {
        byte[] array;
        int length = bArr.length;
        int i8 = true != z7 ? 255 : 239;
        if (length > i8) {
            bArr = g(4096).m();
        }
        int i9 = i8 + 1;
        int length2 = bArr.length;
        byte b8 = (byte) length2;
        if (length2 < i8) {
            byte[] bArr2 = new byte[i8 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i9).put(b8).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i9).put(b8).put(bArr).array();
        }
        if (z7) {
            array = ByteBuffer.allocate(256).put(f(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC3136k9[] interfaceC3136k9Arr = new C4770z9().f28336G2;
        int length3 = interfaceC3136k9Arr.length;
        for (int i10 = 0; i10 < 12; i10++) {
            interfaceC3136k9Arr[i10].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new W8(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }
}
