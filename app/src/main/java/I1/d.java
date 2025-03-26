package I1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f3121b;

    /* renamed from: c, reason: collision with root package name */
    private c f3122c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3120a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f3123d = 0;

    private boolean b() {
        return this.f3122c.f3108b != 0;
    }

    private int d() {
        try {
            return this.f3121b.get() & 255;
        } catch (Exception unused) {
            this.f3122c.f3108b = 1;
            return 0;
        }
    }

    private void e() {
        this.f3122c.f3110d.f3096a = n();
        this.f3122c.f3110d.f3097b = n();
        this.f3122c.f3110d.f3098c = n();
        this.f3122c.f3110d.f3099d = n();
        int d8 = d();
        boolean z7 = (d8 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d8 & 7) + 1);
        b bVar = this.f3122c.f3110d;
        bVar.f3100e = (d8 & 64) != 0;
        if (z7) {
            bVar.f3106k = g(pow);
        } else {
            bVar.f3106k = null;
        }
        this.f3122c.f3110d.f3105j = this.f3121b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f3122c;
        cVar.f3109c++;
        cVar.f3111e.add(cVar.f3110d);
    }

    private void f() {
        int d8 = d();
        this.f3123d = d8;
        if (d8 <= 0) {
            return;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            try {
                i9 = this.f3123d;
                if (i8 >= i9) {
                    return;
                }
                i9 -= i8;
                this.f3121b.get(this.f3120a, i8, i9);
                i8 += i9;
            } catch (Exception e8) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i8 + " count: " + i9 + " blockSize: " + this.f3123d, e8);
                }
                this.f3122c.f3108b = 1;
                return;
            }
        }
    }

    private int[] g(int i8) {
        byte[] bArr = new byte[i8 * 3];
        int[] iArr = null;
        try {
            this.f3121b.get(bArr);
            iArr = new int[256];
            int i9 = 0;
            int i10 = 0;
            while (i9 < i8) {
                int i11 = bArr[i10] & 255;
                int i12 = i10 + 2;
                int i13 = bArr[i10 + 1] & 255;
                i10 += 3;
                int i14 = i9 + 1;
                iArr[i9] = (i13 << 8) | (i11 << 16) | (-16777216) | (bArr[i12] & 255);
                i9 = i14;
            }
        } catch (BufferUnderflowException e8) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e8);
            }
            this.f3122c.f3108b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i8) {
        boolean z7 = false;
        while (!z7 && !b() && this.f3122c.f3109c <= i8) {
            int d8 = d();
            if (d8 == 33) {
                int d9 = d();
                if (d9 == 1) {
                    q();
                } else if (d9 == 249) {
                    this.f3122c.f3110d = new b();
                    j();
                } else if (d9 == 254) {
                    q();
                } else if (d9 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i9 = 0; i9 < 11; i9++) {
                        sb.append((char) this.f3120a[i9]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d8 == 44) {
                c cVar = this.f3122c;
                if (cVar.f3110d == null) {
                    cVar.f3110d = new b();
                }
                e();
            } else if (d8 != 59) {
                this.f3122c.f3108b = 1;
            } else {
                z7 = true;
            }
        }
    }

    private void j() {
        d();
        int d8 = d();
        b bVar = this.f3122c.f3110d;
        int i8 = (d8 & 28) >> 2;
        bVar.f3102g = i8;
        if (i8 == 0) {
            bVar.f3102g = 1;
        }
        bVar.f3101f = (d8 & 1) != 0;
        int n8 = n();
        if (n8 < 2) {
            n8 = 10;
        }
        b bVar2 = this.f3122c.f3110d;
        bVar2.f3104i = n8 * 10;
        bVar2.f3103h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < 6; i8++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f3122c.f3108b = 1;
            return;
        }
        l();
        if (!this.f3122c.f3114h || b()) {
            return;
        }
        c cVar = this.f3122c;
        cVar.f3107a = g(cVar.f3115i);
        c cVar2 = this.f3122c;
        cVar2.f3118l = cVar2.f3107a[cVar2.f3116j];
    }

    private void l() {
        this.f3122c.f3112f = n();
        this.f3122c.f3113g = n();
        int d8 = d();
        c cVar = this.f3122c;
        cVar.f3114h = (d8 & 128) != 0;
        cVar.f3115i = (int) Math.pow(2.0d, (d8 & 7) + 1);
        this.f3122c.f3116j = d();
        this.f3122c.f3117k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f3120a;
            if (bArr[0] == 1) {
                this.f3122c.f3119m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f3123d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f3121b.getShort();
    }

    private void o() {
        this.f3121b = null;
        Arrays.fill(this.f3120a, (byte) 0);
        this.f3122c = new c();
        this.f3123d = 0;
    }

    private void q() {
        int d8;
        do {
            d8 = d();
            this.f3121b.position(Math.min(this.f3121b.position() + d8, this.f3121b.limit()));
        } while (d8 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f3121b = null;
        this.f3122c = null;
    }

    public c c() {
        if (this.f3121b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f3122c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f3122c;
            if (cVar.f3109c < 0) {
                cVar.f3108b = 1;
            }
        }
        return this.f3122c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f3121b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f3121b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
