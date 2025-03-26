package Z5;

import J6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class e extends d {

    /* renamed from: y, reason: collision with root package name */
    private final int f6445y;

    public e(int i8, int i9) {
        super(i8);
        this.f6445y = i9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public ByteBuffer e(ByteBuffer byteBuffer) {
        r.e(byteBuffer, "instance");
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ByteBuffer h() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f6445y);
        r.b(allocateDirect);
        return allocateDirect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void l(ByteBuffer byteBuffer) {
        r.e(byteBuffer, "instance");
        if (byteBuffer.capacity() != this.f6445y) {
            throw new IllegalStateException("Check failed.");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
