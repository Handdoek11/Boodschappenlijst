package m7;

import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class s extends j7.a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6227a f39462a;

    /* renamed from: b, reason: collision with root package name */
    private final n7.b f39463b;

    public s(AbstractC6227a abstractC6227a, l7.a aVar) {
        J6.r.e(abstractC6227a, "lexer");
        J6.r.e(aVar, "json");
        this.f39462a = abstractC6227a;
        this.f39463b = aVar.a();
    }

    @Override // j7.a, j7.e
    public byte C() {
        AbstractC6227a abstractC6227a = this.f39462a;
        String s8 = abstractC6227a.s();
        try {
            return S6.y.a(s8);
        } catch (IllegalArgumentException unused) {
            AbstractC6227a.y(abstractC6227a, "Failed to parse type 'UByte' for input '" + s8 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // j7.a, j7.e
    public short E() {
        AbstractC6227a abstractC6227a = this.f39462a;
        String s8 = abstractC6227a.s();
        try {
            return S6.y.j(s8);
        } catch (IllegalArgumentException unused) {
            AbstractC6227a.y(abstractC6227a, "Failed to parse type 'UShort' for input '" + s8 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // j7.c
    public n7.b a() {
        return this.f39463b;
    }

    @Override // j7.c
    public int e(i7.f fVar) {
        J6.r.e(fVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // j7.a, j7.e
    public int n() {
        AbstractC6227a abstractC6227a = this.f39462a;
        String s8 = abstractC6227a.s();
        try {
            return S6.y.d(s8);
        } catch (IllegalArgumentException unused) {
            AbstractC6227a.y(abstractC6227a, "Failed to parse type 'UInt' for input '" + s8 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // j7.a, j7.e
    public long t() {
        AbstractC6227a abstractC6227a = this.f39462a;
        String s8 = abstractC6227a.s();
        try {
            return S6.y.g(s8);
        } catch (IllegalArgumentException unused) {
            AbstractC6227a.y(abstractC6227a, "Failed to parse type 'ULong' for input '" + s8 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
