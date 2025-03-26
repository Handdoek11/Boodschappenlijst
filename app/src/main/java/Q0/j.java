package q0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p0.e;
import q.C6407k;
import w0.l;

/* loaded from: classes.dex */
class j extends n {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f40914b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f40915c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f40916d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f40917e;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi24Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f40915c = constructor;
        f40914b = cls;
        f40916d = method2;
        f40917e = method;
    }

    j() {
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i8, int i9, boolean z7) {
        try {
            return ((Boolean) f40916d.invoke(obj, byteBuffer, Integer.valueOf(i8), null, Integer.valueOf(i9), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f40914b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f40917e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean k() {
        Method method = f40916d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object l() {
        try {
            return f40915c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // q0.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i8) {
        Object l8 = l();
        if (l8 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b8 = o.b(context, resources, dVar.b());
            if (b8 == null || !i(l8, b8, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(l8);
    }

    @Override // q0.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i8) {
        Object l8 = l();
        if (l8 == null) {
            return null;
        }
        C6407k c6407k = new C6407k();
        for (l.b bVar : bVarArr) {
            Uri d8 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) c6407k.get(d8);
            if (byteBuffer == null) {
                byteBuffer = o.f(context, cancellationSignal, d8);
                c6407k.put(d8, byteBuffer);
            }
            if (byteBuffer == null || !i(l8, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface j8 = j(l8);
        if (j8 == null) {
            return null;
        }
        return Typeface.create(j8, i8);
    }
}
