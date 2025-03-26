package k7;

import i7.k;
import java.util.Map;
import x6.C6916E;

/* renamed from: k7.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6126f0 extends W {

    /* renamed from: c, reason: collision with root package name */
    private final i7.f f38677c;

    /* renamed from: k7.f0$a */
    private static final class a implements Map.Entry, K6.a {

        /* renamed from: o, reason: collision with root package name */
        private final Object f38678o;

        /* renamed from: s, reason: collision with root package name */
        private final Object f38679s;

        public a(Object obj, Object obj2) {
            this.f38678o = obj;
            this.f38679s = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return J6.r.a(getKey(), aVar.getKey()) && J6.r.a(getValue(), aVar.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f38678o;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f38679s;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return ((getKey() == null ? 0 : getKey().hashCode()) * 31) + (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    /* renamed from: k7.f0$b */
    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ g7.b f38680o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ g7.b f38681s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g7.b bVar, g7.b bVar2) {
            super(1);
            this.f38680o = bVar;
            this.f38681s = bVar2;
        }

        public final void b(i7.a aVar) {
            J6.r.e(aVar, "$this$buildSerialDescriptor");
            i7.a.b(aVar, "key", this.f38680o.getDescriptor(), null, false, 12, null);
            i7.a.b(aVar, "value", this.f38681s.getDescriptor(), null, false, 12, null);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((i7.a) obj);
            return C6916E.f44463a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6126f0(g7.b bVar, g7.b bVar2) {
        super(bVar, bVar2, null);
        J6.r.e(bVar, "keySerializer");
        J6.r.e(bVar2, "valueSerializer");
        this.f38677c = i7.i.c("kotlin.collections.Map.Entry", k.c.f36738a, new i7.f[0], new b(bVar, bVar2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.W
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(Map.Entry entry) {
        J6.r.e(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.W
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object b(Map.Entry entry) {
        J6.r.e(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.W
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map.Entry c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38677c;
    }
}
