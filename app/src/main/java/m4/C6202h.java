package m4;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: m4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6202h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f39055b = AbstractC6203i.z(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicLong f39056c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    private final String f39057a;

    C6202h() {
        byte[] bArr = new byte[10];
        f(bArr);
        e(bArr);
        d(bArr);
        String t7 = AbstractC6203i.t(bArr);
        Locale locale = Locale.US;
        this.f39057a = String.format(locale, "%s%s%s%s", t7.substring(0, 12), t7.substring(12, 16), t7.subSequence(16, 20), f39055b.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j8) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j8);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j8) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j8);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void d(byte[] bArr) {
        byte[] b8 = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b8[0];
        bArr[9] = b8[1];
    }

    private void e(byte[] bArr) {
        byte[] b8 = b(f39056c.incrementAndGet());
        bArr[6] = b8[0];
        bArr[7] = b8[1];
    }

    private void f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a8 = a(time / 1000);
        bArr[0] = a8[0];
        bArr[1] = a8[1];
        bArr[2] = a8[2];
        bArr[3] = a8[3];
        byte[] b8 = b(time % 1000);
        bArr[4] = b8[0];
        bArr[5] = b8[1];
    }

    public String c() {
        return this.f39057a;
    }

    public String toString() {
        return this.f39057a;
    }
}
