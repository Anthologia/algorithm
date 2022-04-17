def solution(n, lost, reserve):
    reserve_set = set(reserve) - set(lost) 
    lost_set = set(lost) - set(reserve) 
    
    for reserve_student in reserve_set: 
        if reserve_student - 1 in lost_set: 
            lost_set.remove(reserve_student - 1) 
        elif reserve_student + 1 in lost_set: 
            lost_set.remove(reserve_student + 1) 
    
    return n - len(lost_set)
