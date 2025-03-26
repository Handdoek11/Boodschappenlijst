package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8421a;

    /* renamed from: b, reason: collision with root package name */
    String f8422b;

    /* renamed from: c, reason: collision with root package name */
    private a f8423c;

    /* renamed from: d, reason: collision with root package name */
    private int f8424d;

    /* renamed from: e, reason: collision with root package name */
    private float f8425e;

    /* renamed from: f, reason: collision with root package name */
    private String f8426f;

    /* renamed from: g, reason: collision with root package name */
    boolean f8427g;

    /* renamed from: h, reason: collision with root package name */
    private int f8428h;

    public enum a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, a aVar, Object obj, boolean z7) {
        this.f8422b = str;
        this.f8423c = aVar;
        this.f8421a = z7;
        d(obj);
    }

    public static HashMap a(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e8) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e8);
            } catch (NoSuchMethodException e9) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e9);
            } catch (InvocationTargetException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        a aVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.f8963t4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        a aVar2 = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            if (index == h.f8971u4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == h.f8633E4) {
                str = obtainStyledAttributes.getString(index);
                z7 = true;
            } else if (index == h.f8979v4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == h.f8995x4) {
                    aVar = a.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.f8987w4) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == h.f8609B4) {
                    aVar = a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == h.f9003y4) {
                    aVar = a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == h.f9011z4) {
                    aVar = a.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == h.f8601A4) {
                    aVar = a.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == h.f8625D4) {
                    aVar = a.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == h.f8617C4) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                aVar2 = aVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, aVar2, obj, z7));
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str);
            String str2 = bVar.f8421a ? str : "set" + str;
            try {
                switch (bVar.f8423c) {
                    case INT_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f8424d));
                        break;
                    case FLOAT_TYPE:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f8425e));
                        break;
                    case COLOR_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f8428h));
                        break;
                    case COLOR_DRAWABLE_TYPE:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f8428h);
                        method.invoke(view, colorDrawable);
                        break;
                    case STRING_TYPE:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f8426f);
                        break;
                    case BOOLEAN_TYPE:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f8427g));
                        break;
                    case DIMENSION_TYPE:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f8425e));
                        break;
                    case REFERENCE_TYPE:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f8424d));
                        break;
                }
            } catch (IllegalAccessException e8) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e8);
            } catch (NoSuchMethodException e9) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e9);
            } catch (InvocationTargetException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e10);
            }
        }
    }

    public void d(Object obj) {
        switch (this.f8423c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f8424d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f8425e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f8428h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f8426f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f8427g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f8425e = ((Float) obj).floatValue();
                break;
        }
    }

    public b(b bVar, Object obj) {
        this.f8421a = false;
        this.f8422b = bVar.f8422b;
        this.f8423c = bVar.f8423c;
        d(obj);
    }
}
