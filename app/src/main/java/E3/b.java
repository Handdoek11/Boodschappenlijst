package E3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b {
    public static void a(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Animator animator = (Animator) list.get(i8);
            j8 = Math.max(j8, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j8);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
