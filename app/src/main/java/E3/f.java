package E3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import q.C6407k;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final C6407k f2155a = new C6407k();

    /* renamed from: b, reason: collision with root package name */
    private final C6407k f2156b = new C6407k();

    private static void a(f fVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            fVar.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            fVar.h(objectAnimator.getPropertyName(), g.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static f b(Context context, TypedArray typedArray, int i8) {
        int resourceId;
        if (!typedArray.hasValue(i8) || (resourceId = typedArray.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static f c(Context context, int i8) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i8);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e8) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i8), e8);
            return null;
        }
    }

    private static f d(List list) {
        f fVar = new f();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            a(fVar, (Animator) list.get(i8));
        }
        return fVar;
    }

    public g e(String str) {
        if (f(str)) {
            return (g) this.f2155a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f2155a.equals(((f) obj).f2155a);
        }
        return false;
    }

    public boolean f(String str) {
        return this.f2155a.get(str) != null;
    }

    public void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f2156b.put(str, propertyValuesHolderArr);
    }

    public void h(String str, g gVar) {
        this.f2155a.put(str, gVar);
    }

    public int hashCode() {
        return this.f2155a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2155a + "}\n";
    }
}
