package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f37373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f37374c;

    public /* synthetic */ f(Predicate predicate, Predicate predicate2, int i8) {
        this.f37372a = i8;
        this.f37373b = predicate;
        this.f37374c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f37372a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f37372a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f37372a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f37372a) {
            case 0:
                return this.f37373b.test(obj) && this.f37374c.test(obj);
            default:
                return this.f37373b.test(obj) || this.f37374c.test(obj);
        }
    }
}
