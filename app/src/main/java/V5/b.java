package V5;

import J6.r;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5731a = new b();

    private b() {
    }

    @Override // V5.a
    public void a(ByteBuffer byteBuffer) {
        r.e(byteBuffer, "instance");
    }

    @Override // V5.a
    public ByteBuffer b(int i8) {
        ByteBuffer allocate = ByteBuffer.allocate(i8);
        r.d(allocate, "allocate(size)");
        return c.b(allocate);
    }
}
