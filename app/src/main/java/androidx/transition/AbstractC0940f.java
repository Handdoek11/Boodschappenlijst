package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: androidx.transition.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0940f {

    /* renamed from: androidx.transition.f$a */
    static class a {
        static <T, V> ObjectAnimator a(T t7, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t7, property, (TypeConverter) null, path);
        }
    }

    static ObjectAnimator a(Object obj, Property property, Path path) {
        return a.a(obj, property, path);
    }
}
