package Z5;

import J6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: y, reason: collision with root package name */
    private final int f6436y;

    public b(int i8, int i9) {
        super(i8);
        this.f6436y = i9;
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
        ByteBuffer allocate = ByteBuffer.allocate(this.f6436y);
        r.b(allocate);
        return allocate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Z5.d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void l(ByteBuffer byteBuffer) {
        r.e(byteBuffer, "instance");
        if (byteBuffer.capacity() != this.f6436y) {
            throw new IllegalStateException("Check failed.");
        }
        if (byteBuffer.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
