package k7;

import k7.K;

/* loaded from: classes2.dex */
public abstract class Q {

    public static final class a implements K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g7.b f38645a;

        a(g7.b bVar) {
            this.f38645a = bVar;
        }

        @Override // k7.K
        public g7.b[] childSerializers() {
            return new g7.b[]{this.f38645a};
        }

        @Override // g7.a
        public Object deserialize(j7.e eVar) {
            J6.r.e(eVar, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // g7.b, g7.h, g7.a
        public i7.f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // g7.h
        public void serialize(j7.f fVar, Object obj) {
            J6.r.e(fVar, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // k7.K
        public g7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }
    }

    public static final i7.f a(String str, g7.b bVar) {
        J6.r.e(str, "name");
        J6.r.e(bVar, "primitiveSerializer");
        return new P(str, new a(bVar));
    }
}
