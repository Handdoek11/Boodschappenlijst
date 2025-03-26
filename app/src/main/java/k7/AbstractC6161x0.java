package k7;

import java.util.Iterator;

/* renamed from: k7.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6161x0 extends AbstractC6158w {

    /* renamed from: b, reason: collision with root package name */
    private final i7.f f38744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6161x0(g7.b bVar) {
        super(bVar, null);
        J6.r.e(bVar, "primitiveSerializer");
        this.f38744b = new C6159w0(bVar.getDescriptor());
    }

    @Override // k7.AbstractC6115a
    protected final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // k7.AbstractC6115a, g7.a
    public final Object deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        return f(eVar, null);
    }

    @Override // k7.AbstractC6158w, g7.b, g7.h, g7.a
    public final i7.f getDescriptor() {
        return this.f38744b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final AbstractC6157v0 a() {
        return (AbstractC6157v0) k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(AbstractC6157v0 abstractC6157v0) {
        J6.r.e(abstractC6157v0, "<this>");
        return abstractC6157v0.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(AbstractC6157v0 abstractC6157v0, int i8) {
        J6.r.e(abstractC6157v0, "<this>");
        abstractC6157v0.b(i8);
    }

    protected abstract Object r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(AbstractC6157v0 abstractC6157v0, int i8, Object obj) {
        J6.r.e(abstractC6157v0, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // k7.AbstractC6158w, g7.h
    public final void serialize(j7.f fVar, Object obj) {
        J6.r.e(fVar, "encoder");
        int e8 = e(obj);
        i7.f fVar2 = this.f38744b;
        j7.d x7 = fVar.x(fVar2, e8);
        u(x7, obj, e8);
        x7.c(fVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object l(AbstractC6157v0 abstractC6157v0) {
        J6.r.e(abstractC6157v0, "<this>");
        return abstractC6157v0.a();
    }

    protected abstract void u(j7.d dVar, Object obj, int i8);
}
