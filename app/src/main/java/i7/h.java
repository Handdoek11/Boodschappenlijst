package i7;

import J6.r;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class h {

    public static final class a implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private int f36727o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ f f36728s;

        a(f fVar) {
            this.f36728s = fVar;
            this.f36727o = fVar.g();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f36728s;
            int g8 = fVar.g();
            int i8 = this.f36727o;
            this.f36727o = i8 - 1;
            return fVar.k(g8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36727o > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private int f36729o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ f f36730s;

        b(f fVar) {
            this.f36730s = fVar;
            this.f36729o = fVar.g();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f36730s;
            int g8 = fVar.g();
            int i8 = this.f36729o;
            this.f36729o = i8 - 1;
            return fVar.h(g8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36729o > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, K6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ f f36731o;

        public c(f fVar) {
            this.f36731o = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f36731o);
        }
    }

    public static final class d implements Iterable, K6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ f f36732o;

        public d(f fVar) {
            this.f36732o = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f36732o);
        }
    }

    public static final Iterable a(f fVar) {
        r.e(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        r.e(fVar, "<this>");
        return new d(fVar);
    }
}
