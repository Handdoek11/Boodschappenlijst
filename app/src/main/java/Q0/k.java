package q0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import p0.e;
import w0.l;

/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f40918g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f40919h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f40920i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f40921j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f40922k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f40923l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f40924m;

    public k() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = w();
            constructor = x(cls);
            method = t(cls);
            method2 = u(cls);
            method3 = y(cls);
            method4 = s(cls);
            method5 = v(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e8.getClass().getName(), e8);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f40918g = cls;
        this.f40919h = constructor;
        this.f40920i = method;
        this.f40921j = method2;
        this.f40922k = method3;
        this.f40923l = method4;
        this.f40924m = method5;
    }

    private Object m() {
        try {
            return this.f40919h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void n(Object obj) {
        try {
            this.f40923l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean o(Context context, Object obj, String str, int i8, int i9, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f40920i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj, ByteBuffer byteBuffer, int i8, int i9, int i10) {
        try {
            return ((Boolean) this.f40921j.invoke(obj, byteBuffer, Integer.valueOf(i8), null, Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q(Object obj) {
        try {
            return ((Boolean) this.f40922k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r() {
        if (this.f40920i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f40920i != null;
    }

    @Override // q0.i, q0.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i8) {
        if (!r()) {
            return super.a(context, cVar, resources, i8);
        }
        Object m8 = m();
        if (m8 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!o(context, m8, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                n(m8);
                return null;
            }
        }
        if (q(m8)) {
            return j(m8);
        }
        return null;
    }

    @Override // q0.i, q0.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, l.b[] bVarArr, int i8) {
        Typeface j8;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!r()) {
            l.b h8 = h(bVarArr, i8);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h8.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h8.e()).setItalic(h8.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map h9 = o.h(context, bVarArr, cancellationSignal);
        Object m8 = m();
        if (m8 == null) {
            return null;
        }
        boolean z7 = false;
        for (l.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) h9.get(bVar.d());
            if (byteBuffer != null) {
                if (!p(m8, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    n(m8);
                    return null;
                }
                z7 = true;
            }
        }
        if (!z7) {
            n(m8);
            return null;
        }
        if (q(m8) && (j8 = j(m8)) != null) {
            return Typeface.create(j8, i8);
        }
        return null;
    }

    @Override // q0.n
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i8) {
        return super.c(context, cancellationSignal, list, i8);
    }

    @Override // q0.n
    public Typeface e(Context context, Resources resources, int i8, String str, int i9) {
        if (!r()) {
            return super.e(context, resources, i8, str, i9);
        }
        Object m8 = m();
        if (m8 == null) {
            return null;
        }
        if (!o(context, m8, str, 0, -1, -1, null)) {
            n(m8);
            return null;
        }
        if (q(m8)) {
            return j(m8);
        }
        return null;
    }

    protected Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f40918g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f40924m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method s(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method u(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method v(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class w() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor x(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method y(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
