package S1;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f5074a;

    /* renamed from: S1.a$a, reason: collision with other inner class name */
    public static class C0099a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f5074a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f5074a.position(0);
        return this.f5074a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
