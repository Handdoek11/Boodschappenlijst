package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0877a;
import androidx.datastore.preferences.protobuf.AbstractC0899x;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0897v extends AbstractC0877a {
    private static Map<Object, AbstractC0897v> defaultInstanceMap = new ConcurrentHashMap();
    protected j0 unknownFields = j0.e();
    protected int memoizedSerializedSize = -1;

    /* renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static abstract class a extends AbstractC0877a.AbstractC0156a {

        /* renamed from: o, reason: collision with root package name */
        private final AbstractC0897v f9579o;

        /* renamed from: s, reason: collision with root package name */
        protected AbstractC0897v f9580s;

        /* renamed from: t, reason: collision with root package name */
        protected boolean f9581t = false;

        protected a(AbstractC0897v abstractC0897v) {
            this.f9579o = abstractC0897v;
            this.f9580s = (AbstractC0897v) abstractC0897v.q(d.NEW_MUTABLE_INSTANCE);
        }

        private void z(AbstractC0897v abstractC0897v, AbstractC0897v abstractC0897v2) {
            Y.a().d(abstractC0897v).a(abstractC0897v, abstractC0897v2);
        }

        public final AbstractC0897v r() {
            AbstractC0897v j8 = j();
            if (j8.x()) {
                return j8;
            }
            throw AbstractC0877a.AbstractC0156a.q(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.M.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public AbstractC0897v j() {
            if (this.f9581t) {
                return this.f9580s;
            }
            this.f9580s.z();
            this.f9581t = true;
            return this.f9580s;
        }

        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a i8 = c().i();
            i8.y(j());
            return i8;
        }

        protected void v() {
            if (this.f9581t) {
                AbstractC0897v abstractC0897v = (AbstractC0897v) this.f9580s.q(d.NEW_MUTABLE_INSTANCE);
                z(abstractC0897v, this.f9580s);
                this.f9580s = abstractC0897v;
                this.f9581t = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.N
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public AbstractC0897v c() {
            return this.f9579o;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0877a.AbstractC0156a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a m(AbstractC0897v abstractC0897v) {
            return y(abstractC0897v);
        }

        public a y(AbstractC0897v abstractC0897v) {
            v();
            z(this.f9580s, abstractC0897v);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.v$b */
    protected static class b extends AbstractC0878b {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC0897v f9582b;

        public b(AbstractC0897v abstractC0897v) {
            this.f9582b = abstractC0897v;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.v$c */
    public static class c extends AbstractC0888l {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.v$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static AbstractC0899x.b A(AbstractC0899x.b bVar) {
        int size = bVar.size();
        return bVar.u(size == 0 ? 10 : size * 2);
    }

    protected static Object C(M m8, String str, Object[] objArr) {
        return new a0(m8, str, objArr);
    }

    protected static AbstractC0897v D(AbstractC0897v abstractC0897v, InputStream inputStream) {
        return o(E(abstractC0897v, AbstractC0884h.f(inputStream), C0890n.b()));
    }

    static AbstractC0897v E(AbstractC0897v abstractC0897v, AbstractC0884h abstractC0884h, C0890n c0890n) {
        AbstractC0897v abstractC0897v2 = (AbstractC0897v) abstractC0897v.q(d.NEW_MUTABLE_INSTANCE);
        try {
            c0 d8 = Y.a().d(abstractC0897v2);
            d8.b(abstractC0897v2, C0885i.O(abstractC0884h), c0890n);
            d8.c(abstractC0897v2);
            return abstractC0897v2;
        } catch (IOException e8) {
            if (e8.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e8.getCause());
            }
            throw new InvalidProtocolBufferException(e8.getMessage()).i(abstractC0897v2);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e9.getCause());
            }
            throw e9;
        }
    }

    protected static void F(Class cls, AbstractC0897v abstractC0897v) {
        defaultInstanceMap.put(cls, abstractC0897v);
    }

    private static AbstractC0897v o(AbstractC0897v abstractC0897v) {
        if (abstractC0897v == null || abstractC0897v.x()) {
            return abstractC0897v;
        }
        throw abstractC0897v.k().a().i(abstractC0897v);
    }

    protected static AbstractC0899x.b t() {
        return Z.d();
    }

    static AbstractC0897v u(Class cls) {
        AbstractC0897v abstractC0897v = defaultInstanceMap.get(cls);
        if (abstractC0897v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0897v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC0897v == null) {
            abstractC0897v = ((AbstractC0897v) m0.i(cls)).c();
            if (abstractC0897v == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0897v);
        }
        return abstractC0897v;
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean y(AbstractC0897v abstractC0897v, boolean z7) {
        byte byteValue = ((Byte) abstractC0897v.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d8 = Y.a().d(abstractC0897v).d(abstractC0897v);
        if (z7) {
            abstractC0897v.r(d.SET_MEMOIZED_IS_INITIALIZED, d8 ? abstractC0897v : null);
        }
        return d8;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final a i() {
        return (a) q(d.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.M
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a f() {
        a aVar = (a) q(d.NEW_BUILDER);
        aVar.y(this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public int b() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = Y.a().d(this).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0877a
    int d() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c().getClass().isInstance(obj)) {
            return Y.a().d(this).f(this, (AbstractC0897v) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public void h(CodedOutputStream codedOutputStream) {
        Y.a().d(this).e(this, C0886j.P(codedOutputStream));
    }

    public int hashCode() {
        int i8 = this.memoizedHashCode;
        if (i8 != 0) {
            return i8;
        }
        int i9 = Y.a().d(this).i(this);
        this.memoizedHashCode = i9;
        return i9;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0877a
    void l(int i8) {
        this.memoizedSerializedSize = i8;
    }

    Object n() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    protected final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    protected Object q(d dVar) {
        return s(dVar, null, null);
    }

    protected Object r(d dVar, Object obj) {
        return s(dVar, obj, null);
    }

    protected abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return O.e(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.N
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC0897v c() {
        return (AbstractC0897v) q(d.GET_DEFAULT_INSTANCE);
    }

    public final boolean x() {
        return y(this, true);
    }

    protected void z() {
        Y.a().d(this).c(this);
    }
}
