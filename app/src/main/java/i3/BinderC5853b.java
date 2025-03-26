package i3;

import Z2.r;
import android.os.IBinder;
import i3.InterfaceC5852a;
import java.lang.reflect.Field;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5853b extends InterfaceC5852a.AbstractBinderC0269a {

    /* renamed from: o, reason: collision with root package name */
    private final Object f36509o;

    private BinderC5853b(Object obj) {
        this.f36509o = obj;
    }

    public static Object J0(InterfaceC5852a interfaceC5852a) {
        if (interfaceC5852a instanceof BinderC5853b) {
            return ((BinderC5853b) interfaceC5852a).f36509o;
        }
        IBinder asBinder = interfaceC5852a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i8 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i8++;
                field = field2;
            }
        }
        if (i8 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        r.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e8) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e8);
        } catch (NullPointerException e9) {
            throw new IllegalArgumentException("Binder object is null.", e9);
        }
    }

    public static InterfaceC5852a p2(Object obj) {
        return new BinderC5853b(obj);
    }
}
