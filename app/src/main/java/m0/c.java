package M0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f3727a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f3728b;

    /* renamed from: c, reason: collision with root package name */
    private int f3729c;

    /* renamed from: d, reason: collision with root package name */
    private int f3730d;

    /* renamed from: e, reason: collision with root package name */
    d f3731e = d.a();

    protected int a(int i8) {
        return i8 + this.f3728b.getInt(i8);
    }

    protected int b(int i8) {
        if (i8 < this.f3730d) {
            return this.f3728b.getShort(this.f3729c + i8);
        }
        return 0;
    }

    protected void c(int i8, ByteBuffer byteBuffer) {
        this.f3728b = byteBuffer;
        if (byteBuffer == null) {
            this.f3727a = 0;
            this.f3729c = 0;
            this.f3730d = 0;
        } else {
            this.f3727a = i8;
            int i9 = i8 - byteBuffer.getInt(i8);
            this.f3729c = i9;
            this.f3730d = this.f3728b.getShort(i9);
        }
    }

    protected int d(int i8) {
        int i9 = i8 + this.f3727a;
        return i9 + this.f3728b.getInt(i9) + 4;
    }

    protected int e(int i8) {
        int i9 = i8 + this.f3727a;
        return this.f3728b.getInt(i9 + this.f3728b.getInt(i9));
    }
}
