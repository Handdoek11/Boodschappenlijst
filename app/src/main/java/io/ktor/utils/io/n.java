package io.ktor.utils.io;

import J6.r;
import J6.s;
import U6.G;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x6.C6916E;
import x6.C6934p;
import y6.AbstractC6980h;
import z6.AbstractC7088a;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36977a = d(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f36978b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap f36979c = new WeakHashMap();

    public static final class a extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Constructor f36980o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f36980o = constructor;
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object b8;
            r.e(th, AdActionType.EXTERNAL_LINK);
            try {
                C6934p.a aVar = C6934p.f44487s;
                Object newInstance = this.f36980o.newInstance(th.getMessage(), th);
                r.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                b8 = C6934p.b((Throwable) newInstance);
            } catch (Throwable th2) {
                C6934p.a aVar2 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th2));
            }
            if (C6934p.g(b8)) {
                b8 = null;
            }
            return (Throwable) b8;
        }
    }

    public static final class b extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Constructor f36981o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f36981o = constructor;
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object b8;
            r.e(th, AdActionType.EXTERNAL_LINK);
            try {
                C6934p.a aVar = C6934p.f44487s;
                Object newInstance = this.f36981o.newInstance(th);
                r.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                b8 = C6934p.b((Throwable) newInstance);
            } catch (Throwable th2) {
                C6934p.a aVar2 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th2));
            }
            if (C6934p.g(b8)) {
                b8 = null;
            }
            return (Throwable) b8;
        }
    }

    public static final class c extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Constructor f36982o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f36982o = constructor;
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object b8;
            r.e(th, AdActionType.EXTERNAL_LINK);
            try {
                C6934p.a aVar = C6934p.f44487s;
                Object newInstance = this.f36982o.newInstance(th.getMessage());
                r.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) newInstance;
                th2.initCause(th);
                b8 = C6934p.b(th2);
            } catch (Throwable th3) {
                C6934p.a aVar2 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th3));
            }
            if (C6934p.g(b8)) {
                b8 = null;
            }
            return (Throwable) b8;
        }
    }

    public static final class d extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Constructor f36983o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f36983o = constructor;
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object b8;
            r.e(th, AdActionType.EXTERNAL_LINK);
            try {
                C6934p.a aVar = C6934p.f44487s;
                Object newInstance = this.f36983o.newInstance(null);
                r.c(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) newInstance;
                th2.initCause(th);
                b8 = C6934p.b(th2);
            } catch (Throwable th3) {
                C6934p.a aVar2 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th3));
            }
            return (Throwable) (C6934p.g(b8) ? null : b8);
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC7088a.a(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
        }
    }

    static final class f extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final f f36984o = new f();

        f() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            r.e(th, "it");
            return null;
        }
    }

    static final class g extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final g f36985o = new g();

        g() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            r.e(th, "it");
            return null;
        }
    }

    private static final I6.l a(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length != 1) {
            if (length == 2 && r.a(parameterTypes[0], String.class) && r.a(parameterTypes[1], Throwable.class)) {
                return new a(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (r.a(cls, Throwable.class)) {
            return new b(constructor);
        }
        if (r.a(cls, String.class)) {
            return new c(constructor);
        }
        return null;
    }

    private static final int b(Class cls, int i8) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            r.d(declaredFields, "declaredFields");
            int i9 = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i9++;
                }
            }
            i8 += i9;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i8;
    }

    static /* synthetic */ int c(Class cls, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return b(cls, i8);
    }

    private static final int d(Class cls, int i8) {
        Object b8;
        H6.a.c(cls);
        try {
            C6934p.a aVar = C6934p.f44487s;
            b8 = C6934p.b(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            C6934p.a aVar2 = C6934p.f44487s;
            b8 = C6934p.b(x6.q.a(th));
        }
        Integer valueOf = Integer.valueOf(i8);
        if (C6934p.g(b8)) {
            b8 = valueOf;
        }
        return ((Number) b8).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable e(Throwable th, Throwable th2) {
        Object b8;
        r.e(th, "exception");
        r.e(th2, "cause");
        if (th instanceof G) {
            try {
                C6934p.a aVar = C6934p.f44487s;
                b8 = C6934p.b(((G) th).a());
            } catch (Throwable th3) {
                C6934p.a aVar2 = C6934p.f44487s;
                b8 = C6934p.b(x6.q.a(th3));
            }
            return (Throwable) (C6934p.g(b8) ? null : b8);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f36978b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            I6.l lVar = (I6.l) f36979c.get(th.getClass());
            if (lVar != null) {
                return (Throwable) lVar.invoke(th);
            }
            int i8 = 0;
            if (f36977a != d(th.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i9 = 0; i9 < readHoldCount; i9++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f36979c.put(th.getClass(), f.f36984o);
                    C6916E c6916e = C6916E.f44463a;
                    return null;
                } finally {
                    while (i8 < readHoldCount) {
                        readLock2.lock();
                        i8++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = th.getClass().getConstructors();
            r.d(constructors, "exception.javaClass.constructors");
            I6.l lVar2 = null;
            for (Constructor constructor : AbstractC6980h.K(constructors, new e())) {
                r.d(constructor, "constructor");
                lVar2 = a(constructor);
                if (lVar2 != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f36978b;
            ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock2.readLock();
            int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i10 = 0; i10 < readHoldCount2; i10++) {
                readLock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
            writeLock2.lock();
            try {
                f36979c.put(th.getClass(), lVar2 == null ? g.f36985o : lVar2);
                C6916E c6916e2 = C6916E.f44463a;
                while (i8 < readHoldCount2) {
                    readLock3.lock();
                    i8++;
                }
                writeLock2.unlock();
                if (lVar2 != null) {
                    return (Throwable) lVar2.invoke(th2);
                }
                return null;
            } catch (Throwable th4) {
                while (i8 < readHoldCount2) {
                    readLock3.lock();
                    i8++;
                }
                writeLock2.unlock();
                throw th4;
            }
        } finally {
            readLock.unlock();
        }
    }
}
