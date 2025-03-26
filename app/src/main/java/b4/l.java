package b4;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class l {

    static class a implements k, Serializable {

        /* renamed from: o, reason: collision with root package name */
        final k f12004o;

        /* renamed from: s, reason: collision with root package name */
        volatile transient boolean f12005s;

        /* renamed from: t, reason: collision with root package name */
        transient Object f12006t;

        a(k kVar) {
            this.f12004o = (k) h.i(kVar);
        }

        @Override // b4.k
        public Object get() {
            if (!this.f12005s) {
                synchronized (this) {
                    try {
                        if (!this.f12005s) {
                            Object obj = this.f12004o.get();
                            this.f12006t = obj;
                            this.f12005s = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f12006t);
        }

        public String toString() {
            Object obj;
            if (this.f12005s) {
                String valueOf = String.valueOf(this.f12006t);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.f12004o;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b implements k {

        /* renamed from: o, reason: collision with root package name */
        volatile k f12007o;

        /* renamed from: s, reason: collision with root package name */
        volatile boolean f12008s;

        /* renamed from: t, reason: collision with root package name */
        Object f12009t;

        b(k kVar) {
            this.f12007o = (k) h.i(kVar);
        }

        @Override // b4.k
        public Object get() {
            if (!this.f12008s) {
                synchronized (this) {
                    try {
                        if (!this.f12008s) {
                            k kVar = this.f12007o;
                            Objects.requireNonNull(kVar);
                            Object obj = kVar.get();
                            this.f12009t = obj;
                            this.f12008s = true;
                            this.f12007o = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f12009t);
        }

        public String toString() {
            Object obj = this.f12007o;
            if (obj == null) {
                String valueOf = String.valueOf(this.f12009t);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c implements k, Serializable {

        /* renamed from: o, reason: collision with root package name */
        final Object f12010o;

        c(Object obj) {
            this.f12010o = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f12010o, ((c) obj).f12010o);
            }
            return false;
        }

        @Override // b4.k
        public Object get() {
            return this.f12010o;
        }

        public int hashCode() {
            return f.b(this.f12010o);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f12010o);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static k a(k kVar) {
        return ((kVar instanceof b) || (kVar instanceof a)) ? kVar : kVar instanceof Serializable ? new a(kVar) : new b(kVar);
    }

    public static k b(Object obj) {
        return new c(obj);
    }
}
